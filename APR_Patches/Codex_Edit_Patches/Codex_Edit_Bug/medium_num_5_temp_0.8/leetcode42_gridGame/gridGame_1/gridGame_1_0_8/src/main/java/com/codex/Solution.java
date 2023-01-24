package com.codex;

import java.util.*;

public class Solution {
public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[][] dp = new int[2][n];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    dp[i % 2][j] = grid[0][i] + grid[1][j] + dp[(i + 1) % 2][j];
                } else {
                    dp[i % 2][j] = grid[0][i] + grid[1][j] + Math.max(dp[(i + 1) % 2][j], dp[i % 2][j - 1]);
                }
            }
        }
        return dp[1][n - 2];
    }


}