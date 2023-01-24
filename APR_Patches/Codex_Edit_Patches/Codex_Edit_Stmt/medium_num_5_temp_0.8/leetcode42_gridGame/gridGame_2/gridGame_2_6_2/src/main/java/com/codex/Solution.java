package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[][] dp = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i];
        }

        
        for (int i = 1; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int front = j == 0 ? 0 : dp[i - 1][j - 1];
                int middle = dp[i - 1][j];
                int last = j == grid[0].length - 1 ? 0 : dp[i - 1][j + 1];
                dp[i][j] = Math.max(front, Math.max(middle, last)) + grid[i][j];
            }
        }

        return Arrays.stream(dp[grid.length - 1]).max().getAsInt();
    }
}