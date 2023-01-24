package com.codex;

import java.util.*;

public class Solution {
public static long gridGame(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long[][] dp = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][0] + grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[0][j - 1] + grid[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}