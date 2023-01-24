package com.codex;

import java.util.*;

public class Solution {
    public static int minCost(int cost[][], int n, int m) {
        int[][] dp = new int[n][m];
        dp[0][0] = cost[0][0];
        // Copy first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }
        // Copy first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }
        // Copy remaining
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + cost[i][j];
            }
        }
        return dp[n - 1][m - 1];
    } 
}