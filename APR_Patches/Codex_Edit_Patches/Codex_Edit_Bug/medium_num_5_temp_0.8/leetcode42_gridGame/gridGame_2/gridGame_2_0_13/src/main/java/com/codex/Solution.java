package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[2][grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i];
            dp[1][i] = grid[1][i];
        }


        for (int i = 1; i < grid[0].length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (j != 0) {
                    dp[0][j] = Math.min(dp[0][j], grid[0][j] + dp[0][j - 1]);
                    dp[1][j] = Math.min(dp[1][j], grid[1][j] + dp[1][j - 1]);
                }

                if (j != grid[0].length - 1) {
                    dp[0][j] = Math.min(dp[0][j], grid[0][j] + dp[0][j + 1]);
                    dp[1][j] = Math.min(dp[1][j], grid[1][j] + dp[1][j + 1]);
                }
            }
        }
        return Math.min(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    
}