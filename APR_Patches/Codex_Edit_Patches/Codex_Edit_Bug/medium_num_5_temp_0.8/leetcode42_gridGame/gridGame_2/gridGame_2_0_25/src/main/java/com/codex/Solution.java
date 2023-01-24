package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[grid.length][grid[0].length];
        long sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                    sum += grid[i][j];
                } else if (i == 0) {
                    sum += grid[i][j];
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    sum += grid[i][j];
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    sum += grid[i][j];
                }
            }
        }

        return dp[grid.length - 1][grid[0].length - 1] + sum;
    }

    
}