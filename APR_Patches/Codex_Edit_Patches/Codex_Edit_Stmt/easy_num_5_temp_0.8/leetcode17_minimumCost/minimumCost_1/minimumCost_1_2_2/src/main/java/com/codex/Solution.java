package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        for (int i = 1; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], i >= 2 ? dp[i - 2] : Integer.MAX_VALUE) + cost[i];
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    public static int minimumCost1(int[] cost) {
        
        int[] dp = new int[cost.length];
        
        for (int i = 0; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    
}