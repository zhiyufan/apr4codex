package com.codex;

import java.util.*;

public class Solution {
    public static int minimumCost(int[] cost, int n) {
        
        int[] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            int x = (i - 1 >= 0) ? dp[i - 1]: Integer.MAX_VALUE;
            int y = (i - 2 >= 0) ? dp[i - 2]: Integer.MAX_VALUE;
            dp[i] = cost[i] + Math.min(x, y);
        }
        return dp[n - 1];
    }

    
}