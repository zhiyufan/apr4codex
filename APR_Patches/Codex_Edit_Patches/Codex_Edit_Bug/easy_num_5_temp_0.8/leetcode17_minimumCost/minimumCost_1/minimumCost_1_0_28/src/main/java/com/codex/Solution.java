package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        if (cost.length == 2) return cost[0] + cost[1];
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = cost[0];
        dp[2] = cost[1];
        for (int i = 3; i < cost.length + 1 ; i++) {
            dp[i] = cost[i - 1] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[cost.length - 1], dp[cost.length]);
    }
}