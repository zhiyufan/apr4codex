package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n == 0) return 0;
        int[][] dp = new int[n][3];
        int ans = 0;
        dp[0][0] = 0;
        dp[0][1] = events[0][2];
        dp[0][2] = events[0][2];
        
        
        for (int i = 1; i < n; i++) {
            int[] dp2 = new int[3]; 
            dp2[0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp2[1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp2[2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp2[0], Math.max(dp2[1],dp2[2])));
            dp[i] = dp2;
        }
        
        return ans;
    }

    
}