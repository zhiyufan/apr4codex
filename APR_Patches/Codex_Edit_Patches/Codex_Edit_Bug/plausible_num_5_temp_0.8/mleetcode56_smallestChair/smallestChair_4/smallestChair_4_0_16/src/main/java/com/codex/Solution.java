package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;
        for (int[] time : times) {
            minTime =  Math.min(minTime, time[0]);
            maxTime = Math.max(maxTime, time[1]);
        }

        if (minTime > targetFriend || maxTime < targetFriend) return -1;

        int[] chairs = new int[maxTime+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    
}