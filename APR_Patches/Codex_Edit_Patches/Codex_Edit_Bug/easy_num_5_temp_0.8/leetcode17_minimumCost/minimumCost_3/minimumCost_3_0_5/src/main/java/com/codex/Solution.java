package com.codex;

import java.util.*;

public class Solution {
    
	public static int minimumCost(int[] cost) {
        
        int[] dp = new int[cost.length + 1];
        dp[1] = cost[0];
        dp[2] = cost[1];
        
        for (int i = 3; i <= cost.length; i++) {
            dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 2] + dp[i - 3]);
        }
        return dp[cost.length];
    }
}