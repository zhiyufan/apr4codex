package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = 0;
        dp[1][0] = 0;
        int[] max = new int[grid[0].length];
        int[] min = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            max[i] = grid[0][i];
            min[i] = grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (max[j] < grid[i][j]) max[j] = grid[i][j];
                if (min[j] > grid[i][j]) min[j] = grid[i][j];
            }

            for (int j = 0; j < grid[0].length; j++) {
                dp[i][j] = max[j] - min[j];
            }
        }

        return Math.max(dp[0][grid[0].length - 1], dp[1][grid[0].length - 1]);
    }

    
}