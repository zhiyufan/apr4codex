package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
        int currMax = 0;
        for (int[] time : times) {
            currMax = Math.max(currMax, time[0]);
            currMax = Math.max(currMax, time[1]);
        }
        // !!! It is possible that currMax is 0. 
        // If that is the case, then we can return targetFriend in this case.
        int[] chairs = new int[currMax+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    
}