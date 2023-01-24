package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid.length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - 1; j++) {
                if (j == 0) {
                    dp[i][j] = grid[i][0] + grid[j][1] + dp[i - 1][j];
                } else {
                    dp[i][j] = grid[i][0] + grid[j][1] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n - 1][n - 2];
    }

    
}