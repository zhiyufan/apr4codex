package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[1] - b[1]);
        int[] dp = new int[n];
        dp[0] = events[0][2];
        dp[1] = events[1][2];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);	//dp[i-1]表示不选第i个时，前i个的最优解；events[i][2]表示选第i个时，第i个的值；dp[i - 2]表示选第i个时，前i-2个的最优解（不能超过）
        }
        return dp[n-1];
    }

    
}