package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        
        int[][] dp = new int[2][grid[0].length];
        int[][] dp2 = new int[2][grid[0].length];
        
        dp[0][0] = 0;
        dp[1][0] = 0;
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1] + grid[0][i], dp[1][i - 1] + grid[0][i]);
            dp[1][i] = Math.max(dp[0][i - 1] + grid[1][i], dp[1][i - 1] + grid[1][i]);

            dp2[0][i] = Math.max(dp2[0][i - 1], dp2[1][i - 1]);
            dp2[1][i] = dp2[0][i - 1] + grid[1][i];

        }

        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    
}