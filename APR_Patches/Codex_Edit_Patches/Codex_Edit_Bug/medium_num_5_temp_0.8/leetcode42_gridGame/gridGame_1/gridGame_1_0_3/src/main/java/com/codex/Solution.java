package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= i; j--) {
                if (j == 0) {
                    dp[i][j] = grid[0][i] + grid[1][j] + dp[i + 1][j];
                } else {
                    dp[i][j] = grid[0][i] + grid[1][j] + Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }
        return dp[0][0];
    }

    
}