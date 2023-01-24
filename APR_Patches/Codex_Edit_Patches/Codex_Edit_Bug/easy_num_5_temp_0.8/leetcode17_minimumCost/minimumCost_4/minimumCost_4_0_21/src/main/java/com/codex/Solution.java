package com.codex;

import java.util.*;

public class Solution {
   public int minimumCost(int[] cost) {
        if (cost == null || cost.length == 0) return 0;
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
   }
}