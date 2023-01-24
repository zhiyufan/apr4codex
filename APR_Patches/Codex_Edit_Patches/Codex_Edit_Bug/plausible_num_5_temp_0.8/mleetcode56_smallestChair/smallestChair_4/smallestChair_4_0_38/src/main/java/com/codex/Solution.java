package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0;
        int[][] ints = new int[times.length][2];
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times[0].length; j++) {
                ints[i][j] = Integer.parseInt(times[i][j]);
            }
        }
        for (int[] time : times) {
            currMax = Math.max(currMax, time[1]);
        }
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]-1; i < time[1]; i++) chairs[i]++;
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    
}