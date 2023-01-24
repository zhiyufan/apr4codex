package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = grid[0][i] + dp[i - 1][0];
            dp[i][i] = grid[0][i] + dp[i - 1][i - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                 dp[i][j] = grid[0][i] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }
        return Math.max(dp[n - 1][n - 2], dp[n - 1][n - 1]);
    }

    
}