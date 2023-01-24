package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[2][grid[0].length];
        dp[0][0] = 0;
        dp[1][0] = 0;
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
            dp[1][i] = dp[0][i - 1] + grid[1][i - 1];
        }

        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    
}