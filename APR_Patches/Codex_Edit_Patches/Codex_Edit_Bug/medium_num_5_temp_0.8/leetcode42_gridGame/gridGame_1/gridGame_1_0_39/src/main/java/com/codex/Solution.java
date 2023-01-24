package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++){
            int upper = dp[i - 1][i] + grid[0][i];
            int lower = dp[i][i - 1] + grid[0][i];
            dp[i][i] = Math.max(upper, lower);
        }
        return dp[n - 1][n - 2];
    }

    
}