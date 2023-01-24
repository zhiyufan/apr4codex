package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0 || n == 0) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[][] sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i - 1][j - 1];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int a = 1; a <= i; a++) {
                    for (int b = 1; b <= j; b++) {
                        min = Math.min(min, sum[i][j] - sum[i][b - 1] - sum[a - 1][j] + sum[a - 1][b - 1]);
                        max = Math.max(max, sum[i][j] - sum[i][b - 1] - sum[a - 1][j] + sum[a - 1][b - 1]);
                    }
                }
            }
        }
        if (k < min || k > max) return -1;
        if (k == min) return 0;
        int result = 0;
        int l = min;
        int r = max;
        while (l < r) {
            int i = (l + r) >> 1;
            int cnt = 0;
            boolean flag = false;
            for (int a = 1; a <= m; a++) {
                for (int b = 1; b <= n; b++) {
                    for (int c = 1; c <= a; c++) {
                        for (int d = 1; d <= b; d++) {
                            cnt = sum[a][b] - sum[a][d - 1] - sum[c - 1][b] + sum[c - 1][d - 1];
                            if (cnt >= i) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) break;
                    }
                    if (flag) break;
                }
                if (flag) break;
            }
            if (cnt >= k && flag) {
                r = i - 1;
                result = i;
            } else {
                l = i + 1;
            }
        }
        return (result - min) / (m * n);
    }
    ////////////////////////////////////////////////////////////////
    public static int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0 || n == 0) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[][] sum = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + grid[i - 1][j - 1];
                max = Math.max(max, sum[i][j]);
                min = Math.min(min, sum[i][j]);
            }
        }
        if (max - min == 0) return 0;
        int cnt = Math.max(0, (max - min) / (m * n));
        int average = (max + x * cnt * (m * n)) / (m * n);
        int result = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int a = 1; a <= i; a++) {
                    for (int b = 1; b <= j; b++) {
                        result += Math.abs(sum[i][j] - sum[i][b - 1] - sum[a - 1][j] + sum[a - 1][b - 1] - average * (i - a + 1) * (j - b + 1));
                    }
                }
            }
        }
        return result / x;
    }
    ////////////////////////////////////////////////////////////////
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