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
            int t1 = events[i][0];
            int t2 = events[i][1];
            int t3 = events[i][2];
            int t = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][0] = t;
            dp[i][1] = t3 + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = t3 + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }

    
}