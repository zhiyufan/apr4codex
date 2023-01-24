package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {
        
		  int max = 0;
        for (int[] time : times) {
            max = Math.max(max, time[0]);
            max = Math.max(max, time[1]);
        }
        
        int currMax = 0;
        int[] chairs = new int[max+1];
        for (int[] time : times) {
            for (int i = time[0]; i < time[1]; i++) chairs[i]++;
        }
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == targetFriend) return i;
        }
        return -1;
    }

    
}