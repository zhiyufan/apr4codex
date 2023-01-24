package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        if (cost.length == 1) return cost[0];
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        int first, second;
        for (int i = 2; i < cost.length; i++) {
            if (i == 2) {
                first = dp[0] + cost[i];
                second = dp[1];
            }
            else if (i == 3) {
                first = dp[0] + cost[i];
                second = dp[2];
            } 
            else {
                first = dp[i - 3] + cost[i];
                second = dp[i - 2];
            }
            dp[i] = Math.min(first, second);
        }
        return dp[dp.length - 2];
    }

    
}