package com.codex;

import java.util.*;

public class Solution {
    
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0;
        for (int[] time : times) {
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }

        int min = -1;
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) {
                if (min == -1 || i < min) min = i;
            }
        }
        return min;
    }
}