package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        Integer[][] dp = new Integer[grid.length][grid[0].length];
        return gridRecursive(grid, 0, 0, dp);
    }
    
    public static int gridRecursive(int[][] grid, int i, int j, Integer[][] dp) {
        if (i == grid.length || j == grid[0].length) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        int myChoice = grid[i][j] + Math.max(gridRecursive(grid, i + 1, j, dp), gridRecursive(grid, i, j + 1, dp));
        int foeChoice = gridRecursive(grid, i + 1, j + 1, dp);
        dp[i][j] = Math.max(myChoice, foeChoice);
        return dp[i][j];
    }

    
}