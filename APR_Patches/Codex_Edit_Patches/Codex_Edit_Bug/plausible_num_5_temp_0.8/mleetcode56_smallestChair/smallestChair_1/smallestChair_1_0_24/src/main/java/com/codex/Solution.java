package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        


        int[] arr = new int[times.length];
        for (int i = 0; i < times.length; i++) {
            int arrival = times[i][0];
            int leaving = times[i][1];
            arr[arrival]++;
            arr[leaving]--;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i];
            if (cnt - 1 == targetFriend)
                return i;
        }

        return 0;
    }



    public static int getAverageTime(File[] files) {
        int count = files.length;
        int totalTime = 0;
        for (File f : files) {
            if (f.isDirectory()) {
                totalTime += getAverageTime(f.listFiles());
                continue;
            }
            totalTime += utils.getFileTime(f);
        }
        return totalTime / count;
    }




    public static int getAverageTime(File[] files) {
        int count = files.length;
        int totalTime = 0;
        int totalTime = 0;

        for (File f : files) {
            if (f.isDirectory()) {
                totalTime += getAverageTime(f.listFiles());
                continue;
            }
            totalTime += utils.getFileTime(f);
        }

        return totalTime / count;
    }


}