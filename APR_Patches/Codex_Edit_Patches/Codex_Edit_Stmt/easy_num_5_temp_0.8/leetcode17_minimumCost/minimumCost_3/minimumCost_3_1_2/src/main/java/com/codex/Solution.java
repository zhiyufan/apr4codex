package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost) {

        int[] dp = new int[cost.length + 1];
        dp[1] = cost[0];
        dp[2] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i + 1] = Math.min(cost[i] + dp[i], cost[i] + dp[i - 1]);
        }
        return dp[dp.length - 1];
    }
    }
    
}