package com.codex;

import java.util.*;

public class Solution {
package com.bignerdranch.android.runtracker;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

public class RunManager {
    private static final String TAG = "RunManager";

    public static final String ACTION_LOCATION =
            "com.bignerdranch.android.runtracker.ACTION_LOCATION";

    private static RunManager sRunManager;

    private Context mAppContext;
    private RunDatabaseHelper mHelper;
    private LocationPoller mPoller;

    private RunManager(Context appContext) {
        mAppContext = appContext;
        mHelper = new RunDatabaseHelper(mAppContext);
        mPoller = new LocationPoller();
    }

    public static RunManager get(Context c) {
        if (sRunManager == null) {
            // Use the application context to avoid leaking activities
            sRunManager = new RunManager(c.getApplicationContext());
        }
        return sRunManager;
    }

    private PendingIntent getLocationPendingIntent(boolean shouldCreate) {
        Intent broadcast = new Intent(ACTION_LOCATION);
        int flags = shouldCreate ? 0 : PendingIntent.FLAG_NO_CREATE;
        return PendingIntent.getBroadcast(mAppContext, 0, broadcast, flags);
    }

    public void startLocationPolling() {
        PendingIntent pi = getLocationPendingIntent(true);
        mPoller.startPolling(mAppContext, pi, 60000);
    }

    public void stopLocationPolling() {
        PendingIntent pi = getLocationPendingIntent(false);
        if (pi != null) {
            mPoller.stopPolling(mAppContext, pi);
        }
    }

    public boolean isTrackingRun(Run run) {
        return getLocationPendingIntent(false) != null;
    }

    public Run startNewRun() {
        // insert a run into the db
        Run run = insertRun();
        // start tracking the run
        startTrackingRun(run);
        return run;
    }

    public void startTrackingRun(Run run) {
        // keep the ID
        mCurrentRunId = run.getId();
        // store it in shared preferences
        mPrefs.edit().putLong(PREF_CURRENT_RUN_ID, mCurrentRunId).commit();
        // start location update
        startLocationUpdates();
    }

    public void stopRun() {
        stopLocationUpdates();
        mCurrentRunId = null;
        mPrefs.edit().remove(PREF_CURRENT_RUN_ID).commit();
    }

    private Run insertRun() {
        Run run = new Run();
        run.setId(mHelper.insertRun(run));
        return run;
    }

    public RunDatabaseHelper.RunCursor queryRuns() {
        return mHelper.queryRuns();
    }

    public Run getRun(long id) {
        Run run = null;
        RunDatabaseHelper.RunCursor cursor = mHelper.queryRun(id);
        cursor.moveToFirst();
        // if you got a row, get a run
        if (!cursor.isAfterLast())
            run = cursor.getRun();
        cursor.close();
        return run;
    }

    public Location getLastLocationForRun (long runId) {
        Location location = null;
        RunDatabaseHelper.LocationCursor cursor = mHelper.queryLastLocationForRun(runId);
        cursor.moveToFirst();
        // if you got a row, get a location
        if (!cursor.isAfterLast())
            location = cursor.getLocation();
        cursor.close();
        return location;
    }

    public void insertLocation (Location loc) {
        if (mCurrentRunId != null) {
            mHelper.insertLocation(mCurrentRunId, loc);
        } else {
            Log.e(TAG, "Location received with no tracking run; ignoring.");
        }
    }

    public static int nearestExit(char[][] maze, int[] entrance) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.poll();
                int r = cur[0];
                int c = cur[1];

                if (r == 0 || c == 0 || r == maze.length - 1 || c == maze[0].length - 1) {
                    return level;
                }

                for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
                    int i = r, j = c;
                    while (i + d[0] >= 0 && j + d[1] >= 0 && i + d[0] < maze.length && j + d[1] < maze[0].length && maze[i + d[0]][j + d[1]] != '+') {
                        i += d[0];
                        j += d[1];
                    }
                    if (!visited[i][j]) {
                        queue.offer(new int[]{i, j});
                        visited[i][j] = true;
                    }
                }
            }
            level++;
        }
        return -1;
    }


    public static void main(String[] args) {
        char[][] maze = {{'+', '+', '+', '+', '+'},
                {'+', '-', '-', '-', '+'},
                {'+', '+', '+', '+', '+'},
                {'+', '-', '-', '-', '+'},
                {'+', '-', '+', '-', '+'},
                {'+', '-', '+', '-', '+'},
                {'+', '-', '+', '-', '+'},
                {'+', '-', '-', '-', '+'},
                {'+', '+', '+', '+', '+'}};
        int[] entrance = {4, 0};
        int res = nearestExit(maze, entrance);
        System.out.println(res);
    }
}
}