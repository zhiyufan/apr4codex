package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        // write your code here.
        /*
        if (grid.length == 0 && grid[0].length == 0) {
            return -1;
        }
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (i == n - 1 && j == 0) {
                    dp[i][j] = grid[0][i] + grid[1][j] + dp[i - 1][j];
                } else {
                    dp[i][j] = grid[0][i] + grid[1][j] + Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n - 1][n - 2];*/
        if (grid.length == 0 && grid[0].length == 0) {
            return -1;
        }
        int n = grid[0].length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][0] = grid[0][i] + (i == 0 ? 0 : dp[i - 1][0]);
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = grid[1][i] + (i == 0 ? 0 : dp[0][i - 1]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int max = Math.max(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = max + grid[0][i] + grid[1][j];
            }
        }
        return dp[n - 1][n - 2];
    }
}