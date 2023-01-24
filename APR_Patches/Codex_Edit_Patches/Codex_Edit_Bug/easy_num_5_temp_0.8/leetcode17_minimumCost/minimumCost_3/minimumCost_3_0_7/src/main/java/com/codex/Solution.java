package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        int[] dp = new int[cost.length + 1];
        dp[1] = cost[0];
        dp[2] = cost[1];
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], Math.min(cost[i - 2] + dp[i - 2], cost[i - 3] + dp[i - 3]));
        }
        return dp[dp.length - 1];
    }

    
}