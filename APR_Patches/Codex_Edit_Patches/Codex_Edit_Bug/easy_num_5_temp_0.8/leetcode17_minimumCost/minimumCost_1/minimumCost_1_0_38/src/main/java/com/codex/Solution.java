package com.codex;

import java.util.*;

public class Solution {
 public static int minimumCost(int[] cost) {
        if (cost.length == 0) {
            throw new IllegalArgumentException("No house is here to paint");
        }
        if (cost.length == 1) {
            return cost[0];
        }

        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = cost[0];
        dp[2] = Math.min(cost[0], cost[1]);

        for (int i = 3; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i - 1];
        }

        return dp[cost.length];
    }
}


    
}