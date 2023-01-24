package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] row0 = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            row0[i] = grid[0][i];
        }

        int[] row1 = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            row1[i] = grid[1][i];
        }

        Arrays.sort(row0);
        Arrays.sort(row1);

        int[][] dp = new int[2][grid[0].length];
        dp[0][0] = 0;
        dp[1][0] = 0;
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1]);
            dp[1][i] = dp[0][i - 1] + row1[i];
        }

        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    
}