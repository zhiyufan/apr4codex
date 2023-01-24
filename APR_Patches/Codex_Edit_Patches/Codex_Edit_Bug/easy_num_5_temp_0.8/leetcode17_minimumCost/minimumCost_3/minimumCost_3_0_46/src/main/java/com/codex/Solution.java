package com.codex;

import java.util.*;

public class Solution {
public static int minimumCost(int[] cost) {
        
        if (cost.length == 0)
            return 0;
        
        int[] dp = new int[cost.length + 1];
        dp[1] = cost[0];
        if (cost.length > 1)
            dp[2] = cost[1];
        else 
            return dp[1];
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 1] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}