package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == n - 1 && j == n - 1) {
                    dp[i][j] = grid[1][n - 1];
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + grid[0][i] + grid[1][j];
                } else if (j == n - 1) {
                    dp[i][j] = Math.min(dp[i][j - 1], dp[i + 1][j]) + grid[0][i] + grid[1][j];
                } else if (i == n - 1) {
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i - 1][j]) + grid[0][i] + grid[1][j];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]), Math.min(dp[i][j - 1], dp[i - 1][j])) + grid[0][i] + grid[1][j];
                }
            }
        }
        return dp[0][0];
    }
}