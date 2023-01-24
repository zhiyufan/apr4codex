package com.codex;

import java.util.*;

public class Solution {
public int minCostClimbingStairs(int[] cost) {
        
    int[] dp = new int[cost.length];
    for (int i = 2; i < cost.length; i++) {
        dp[i] = Math.min(dp[i - 2] + cost[i], dp[i - 1] + cost[i]);
    }

    return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
}


public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len < 2) return 0;
        int[] dp = new int[len + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[len];
    }
}


public int minCostClimbingStairs(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        int[] dp = new int[cost.length+1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 3; i < cost.length+1; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}