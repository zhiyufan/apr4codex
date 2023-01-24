package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {
        
        int[] dp = new int[cost.length];
        if(cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }
        if (cost.length == 2) {
            return cost[1];
        }
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(Math.min((dp[i - 1] + cost[i]), (dp[i - 2] + cost[i])), dp[i - 1]);
        }
        return dp[dp.length - 2];
    }

    
}