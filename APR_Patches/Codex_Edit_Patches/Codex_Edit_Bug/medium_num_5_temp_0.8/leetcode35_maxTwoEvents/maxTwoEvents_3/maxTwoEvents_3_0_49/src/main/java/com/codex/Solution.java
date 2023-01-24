package com.codex;

import java.util.*;

public class Solution {
    public static int maxEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = events[i][2];
            for (int j = 0; j < i; j++) {
                if (events[j][1] <= events[i][0]) {
                    dp[i] = Math.max(dp[i], events[i][2] + dp[j]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return dp[n-1];
    }

    
}