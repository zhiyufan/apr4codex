package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];

        // Bottom-Up approach
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = grid[0][i - 1] + grid[1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = grid[0][i - 1] + grid[1][j - 1] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n - 1][n - 2];
    }

}