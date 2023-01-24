package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    dp[i][j] = grid[0][i] + grid[1][j];
                } else {
                    dp[i][j] = grid[0][i] + grid[1][j];
                }
            }
        }
        return dp[n - 1][n - 2] + Math.max(dp[n - 1][n - 1], dp[n - 2][n - 2]);
    }

    
}