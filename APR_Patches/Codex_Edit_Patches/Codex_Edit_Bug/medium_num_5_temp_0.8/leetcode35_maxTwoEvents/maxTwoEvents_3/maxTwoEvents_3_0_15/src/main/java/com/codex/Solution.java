package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n+1];
        dp[1] = events[0][2];
        
        for (int i = 2; i < n; i++) {
            if (events[i][0] >= events[i-1][1]) {
                dp[i+1] = Math.max(dp[i], events[i][2] + dp[i-1]);
            } else {
                dp[i+1] = dp[i];
            }
        }
        return dp[n-1];
    }

    
}