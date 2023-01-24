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
            dp[i] = Math.max(dp[i-1], events[i][2] + dp[i - 2]);
        }
        return dp[n-1];
    }
    public class Solution {
    public int minCost(int[][] costs) {
        if (costs.length == 0)
            return 0;
        int[] dp = new int[3];
        dp[0] = costs[0][0];
        dp[1] = costs[0][1];
        dp[2] = costs[0][2];
        
        for (int i = 1; i < costs.length; i++) {
            int[] temp = new int[3];
            temp[0] = costs[i][0] + Math.min(dp[1], dp[2]);
            temp[1] = costs[i][1] + Math.min(dp[0], dp[2]);
            temp[2] = costs[i][2] + Math.min(dp[0], dp[1]);
            dp[0] = temp[0];
            dp[1] = temp[1];
            dp[2] = temp[2];
        }
        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }
}

    
}