package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == n - 1 && j == n - 1) {
                    dp[i][j] = 0;
                } else if (i == n - 1) {
                    dp[i][j] = dp[i][j + 1] + grid[0][j] + grid[1][j];
                } else if (j == n - 1) {
                    dp[i][j] = dp[i + 1][j] + grid[0][j] + grid[1][j];
                } else {
                    dp[i][j] = grid[0][j] + grid[1][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }

    
}