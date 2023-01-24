package com.codex;

import java.util.*;

public class Solution {
public static int minimumCost(int[] cost) {

    if (cost == null || cost.length == 0) {
        return 0;
    }

    int n = cost.length;
    if (n == 1) {
        return cost[0];
    }

    if (n == 2) {
        return Math.min(cost[0], cost[1]);
    }

    int[] dp = new int[n];
    dp[0] = cost[0];
    dp[1] = cost[1];

    for (int i = 2; i < n; i++) {
        dp[i] = Integer.MAX_VALUE;
        for (int j = 0; j < i; j++) {

            int costI = dp[j] + cost[i];
            dp[i] = Math.min(costI, dp[i]);
        }
    }

    return dp[n - 1];
}
}