package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    dp[i][j] = grid[0][i] + grid[1][j] + dp[i - 1][j];
                } else {
                    dp[i][j] = grid[0][i] + grid[1][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n - 1][n - 2];
    }

    
}