package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0, currMin = times[0][0];
        for (int i = 1; i < times.length; i++) {
            currMin = Math.min(currMin, times[i][0]);
            currMax = Math.max(currMax, times[i][1]);
        }
        System.out.println(currMax);
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i : chairs) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    
}