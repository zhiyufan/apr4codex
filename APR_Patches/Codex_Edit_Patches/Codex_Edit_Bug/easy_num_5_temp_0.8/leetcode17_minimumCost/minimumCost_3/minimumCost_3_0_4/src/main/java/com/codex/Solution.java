package com.codex;

import java.util.*;

public class Solution {
public static int minimumCost(int[] cost) {

    int[] dp = new int[cost.length + 1];
    dp[1] = cost[0];
    dp[2] = cost[1];
    for (int i = 3; i < dp.length; i++) {
        int current = cost[i - 1];
        if (current < dp[i - 1] + dp[i - 2]) {
            dp[i] = current + dp[i - 1];
        } else {
            dp[i] = current + dp[i - 2];
        }
    }

    return dp[dp.length - 1];
}
}