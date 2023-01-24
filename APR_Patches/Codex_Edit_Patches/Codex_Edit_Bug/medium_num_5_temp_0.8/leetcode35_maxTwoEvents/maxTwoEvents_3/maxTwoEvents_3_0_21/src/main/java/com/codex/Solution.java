package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2]; 
        int max = events[0][2];
       
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(max, events[i][2] + dp[i - 1]);
            max = Math.max(max, dp[i]);
        }
        return dp[n-1];
    }

    
}