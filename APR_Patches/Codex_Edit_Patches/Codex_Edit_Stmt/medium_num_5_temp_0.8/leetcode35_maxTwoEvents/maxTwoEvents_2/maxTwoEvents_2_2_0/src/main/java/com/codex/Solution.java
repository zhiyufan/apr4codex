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
        dp[0][2] = Math.max(events[0][2], Math.max(events[0][1], events[0][0]));
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
            dp[i][1] = events[i][2] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = events[i][2] + dp[i-1][1];
            ans = Math.max(ans, Math.max(dp[i][0], Math.max(dp[i][1],dp[i][2])));
        }
        return ans;
    }

    
}