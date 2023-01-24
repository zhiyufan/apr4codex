package com.codex;

import java.util.*;

public class Solution {
    public static int smallestFulfilledTime(int[][] times, int targetFriend) {
        
        int earliest = Integer.MAX_VALUE;
        int latest = Integer.MIN_VALUE;
        for (int[] time : times) {
            earliest = Math.min(earliest, time[0]);
            latest = Math.max(latest, time[1]);
        }
        int[] chairs = new int[latest+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i = earliest; i < chairs.length; i++) {
            if (chairs[i] >= targetFriend) return i;
        }
        return -1;
    }

    
}