package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0 || n == 0) return 0;
        int[][] sum = new int[m + 1][n + 1];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i - 1][j - 1];
                max = Math.max(max, sum[i][j]);
                min = Math.min(min, sum[i][j]);
            }
        }
        if ((max - min) % (x * (m * n)) != 0 || max == min) {
            return -1;
        }
        
        int cnt = Math.max(0, (max - min) / (x * (m * n)));
        int average = (max + x * cnt * (m * n)) / (m * n);
        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                result += Math.abs((sum[i][j] - sum[i - 1][j] - sum[i][j - 1] + sum[i - 1][j - 1]) / (i * j) - average);
            }
        }
        return result / x;
    }

    
}