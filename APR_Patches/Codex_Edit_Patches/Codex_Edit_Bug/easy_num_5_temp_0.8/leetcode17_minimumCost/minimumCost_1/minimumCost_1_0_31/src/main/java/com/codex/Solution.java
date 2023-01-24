package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] costs) {
        
        if (costs.length == 1) return costs[0];
        int[] dp = new int[costs.length];
        dp[0] = costs[0];
        dp[1] = costs[1];
        for (int i = 2; i < costs.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}