package com.codex;

import java.util.*;

public class Solution {
public static long gridGame(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++)
                dp[i][j] = -1;
        return Math.max(max(grid, 0, 0, dp, true), max(grid, 1, 0, dp, false));
    }
    public static int max(int[][] grid, int i, int j, int[][] dp, boolean flag) {
        if (j == grid[0].length - 1) {
            if (flag)
                return grid[i][j];
            else
                return grid[i == 0 ? 1 : 0][j];
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        int val;
        if (flag)
            val = grid[i][j] + Math.max(max(grid, i, j + 1, dp, true), max(grid, i == 0 ? 1 : 0, j + 1, dp, false));
        else
            val = grid[i][j] + Math.min(max(grid, i, j + 1, dp, true), max(grid, i == 0 ? 1 : 0, j + 1, dp, false));
        dp[i][j] = val;
        return val;
    
    }

    
}