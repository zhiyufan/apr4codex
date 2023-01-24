package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        int n = grid[0].length;//columns
        int m = grid.length;//rows
        int dp[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = 0, b = 0, c = 0, d = 0;
                if (j - 1 >= 0) {
                    a = dp[i - 1][j - 1];
                }
                if (j + 1 < n) {
                    b = dp[i - 1][j + 1];
                }
                c = dp[i - 1][j];
                dp[i][j] = grid[i][j] + Math.max(a, Math.max(b, c));
            }
        }
        int max = dp[m - 1][0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, dp[m - 1][i]);
        }

        return max;
    }

    
}