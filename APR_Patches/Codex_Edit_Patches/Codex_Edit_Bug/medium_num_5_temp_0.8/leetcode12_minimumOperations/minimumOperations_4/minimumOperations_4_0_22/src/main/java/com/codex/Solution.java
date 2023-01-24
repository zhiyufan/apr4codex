package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int minCost(int[][] costs) {
        // Write your solution here
        if (costs == null || costs.length == 0)
            return 0;
        int n = costs.length;
        int[][] dp = new int[n + 1][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                if (d[i][j] == Integer.MAX_VALUE) continue;
                for (int k = 0; k < 3; k++) {
                    if (k == j)  continue;
                    dp[i][j] = Math.min(dp[i][j], costs[i - 1][k] + dp[i - 1][j]);
                }
            }

        }
        return dp[n - 1];
    }

    
}