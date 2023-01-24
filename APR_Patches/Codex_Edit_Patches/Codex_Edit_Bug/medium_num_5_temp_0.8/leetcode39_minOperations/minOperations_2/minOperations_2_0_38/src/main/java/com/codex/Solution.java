package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0 || n == 0) return 0;
        int[][] sum = new int[m][n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    sum[i][j] = grid[0][0];
                } else if (i == 0) {
                    sum[i][j] = sum[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    sum[i][j] = sum[i - 1][j] + grid[i][j];
                } else {
                    sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i][j];
                }
                max = Math.max(max, sum[i][j]);
                min = Math.min(min, sum[i][j]);
            }
        }
        if ((max - min) % (x * (m * n)) != 0) {
            return -1;
        }
        if (max == min) {
            return 0;
        }
        int cnt = (max - min) / (x * (m * n));
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= cnt; i++) {
            int average = (max + x * i * (m * n)) / (m * n);
            int count = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    count += Math.abs(grid[j][k] - average);
                }
            }
        }
        return result / x;
    }

    
}