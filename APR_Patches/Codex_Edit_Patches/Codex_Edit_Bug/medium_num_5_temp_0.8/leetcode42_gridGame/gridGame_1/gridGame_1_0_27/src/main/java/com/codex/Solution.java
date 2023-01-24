package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[j][i] = grid[0][j] + grid[1][i] + dp[j + 1][i];
                } else {
                    dp[j][i] = grid[0][j] + grid[1][i] + Math.max(dp[j + 1][i], dp[j][i - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

    
}