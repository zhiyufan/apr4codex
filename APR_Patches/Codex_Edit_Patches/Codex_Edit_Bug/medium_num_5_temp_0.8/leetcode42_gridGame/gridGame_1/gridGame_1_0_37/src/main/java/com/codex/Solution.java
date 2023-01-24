package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
           
              
                if (j == 0) {
                    dp[i][j] = grid[i][0] + grid[j][1] + dp[j-1][i];
                } else {
                    dp[i][j] = grid[i][0] + grid[j][1] + Math.max(dp[j-1][i], dp[j][i-1]);
                }
            }
        }
        return dp[n - 2][n - 1];
    }

    
}