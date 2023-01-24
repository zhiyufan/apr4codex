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
            for(int j = 0; j < n; j++) {
                if (i == 0 && j == 0) sum[i][j] = grid[0][0];
                else if(i == 0) sum[i][j] = sum[i][j - 1] + grid[0][j];
                else if(j == 0) sum[i][j] = sum[i - 1][j] + grid[i][0];
                else sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i][j];

                max = Math.max(max, sum[i][j]);
                min = Math.min(min, sum[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + grid[i - 1][j - 1];
            }
        }
        if ((max - min) % (x * (m * n)) != 0) {
            return -1;
        }
        if (max == min) {
            return 0;
        }
        int cnt = Math.max(0, (max - min) / (x * (m * n)));
        int average = (max + x * cnt * (m * n)) / (m * n);
        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < average) {
                    result += average - grid[i][j];
                }
            }
        }
        return result / x;
    }
}