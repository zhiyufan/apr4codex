package com.codex;

import java.util.*;

public class Solution {
 public static int minOperations(int[][] grid, int x) {

        int m = grid.length, n = grid[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];

        for (int r = 1; r < m; r++) {
            dp[r][0] = dp[r - 1][0] + grid[r][0];
        }

        for (int c = 1; c < n; c++) {
            dp[0][c] = dp[0][c - 1] + grid[0][c];
        }

        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                dp[r][c] = dp[r][c-1] + dp[r-1][c] - dp[r-1][c-1] + grid[r][c];
            }
        }

        int minM = Integer.MAX_VALUE;
        int sum = 0;
        int[] cnt = new int[x+1];
        for (int r1 = 0; r1 < m; r1++) {
            for (int r2 = r1; r2 < m; r2++) {
                for (int c1 = 0; c1 < n; c1++) {
                    for (int c2 = c1; c2 < n; c2++) {
                        sum = dp[r2][c2];
                        if (c1 > 0) {
                            sum -= dp[r2][c1 - 1];
                        }
                        if (r1 > 0) {
                            sum -= dp[r1 - 1][c2];
                        }
                        if (r1 > 0 && c1 > 0) {
                            sum += dp[r1 - 1][c1 - 1];
                        }
                        cnt[sum % x]++;
                    }
                }
            }
        }
        if (max == min) {
            return 0;
        }
        int cnt = Math.max(0, (max - min) / (x * (m * n)));
        int average = (max + x * cnt * (m * n)) / (m * n);
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.abs(grid[i][j] - average);
            }
        }
        return result / x;
    }

    
}