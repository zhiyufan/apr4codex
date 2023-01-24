package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {  

        if (events == null || events.length == 0) {
            return 0;
        }

        // Sort the events based on time.
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res = dp[0][i];
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

                if (events[j][0] >= events[i][1]) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    // Greedy solution.
    public static int maxTwoEventsGreedy(int[][] events) {
        

        if (events == null || events.length == 0) {
            return 0;
        }

        int n = events.length;
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res = dp[0][i];
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

                if (events[j][0] >= events[i][1] + 1) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    
}