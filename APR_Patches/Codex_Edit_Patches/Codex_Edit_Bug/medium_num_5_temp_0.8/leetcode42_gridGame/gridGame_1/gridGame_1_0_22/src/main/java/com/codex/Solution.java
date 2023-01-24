package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = grid[0][i] + grid[1][j];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] += Math.max(j == 0 ? 0 : dp[i - 1][j - 1], j == n - 1 ? 0 : dp[i - 1][j + 1]);
            }
        }
        return dp[n - 1][n - 2];
    }

    
}