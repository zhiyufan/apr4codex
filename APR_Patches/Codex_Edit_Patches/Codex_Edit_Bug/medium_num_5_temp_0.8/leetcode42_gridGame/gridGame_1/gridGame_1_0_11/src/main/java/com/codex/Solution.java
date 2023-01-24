package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int top = (i == n - 1) ? 0 : dp[i + 1][j];
                int left = (j == n - 1) ? 0 : dp[i][j + 1];
                int bottom = (i == 0) ? 0 : dp[i - 1][j];
                int right = (j == 0) ? 0 : dp[i][j - 1];
                dp[i][j] = grid[i][j] + Math.max(top, Math.max(left, Math.max(bottom, right)));
            }
        }
        return dp[0][0];
    }

    
}