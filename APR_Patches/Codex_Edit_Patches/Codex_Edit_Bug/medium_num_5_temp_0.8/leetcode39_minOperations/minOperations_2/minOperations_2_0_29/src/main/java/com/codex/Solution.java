package com.codex;

import java.util.*;

public class Solution {

    class MaxKilledEnemies {

        int[][] sum = null;
        public int maxKilledEnemies(char[][] grid) {
            int m = grid.length;
            if (m == 0) return 0;
            int n = grid[0].length;
            sum = new int[m][n];
            int max = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 'E') {
                        if (i == 0 && j == 0) {
                            sum[0][0] = 1;
                        } else if (i == 0) {
                            sum[0][j] = sum[0][j - 1] + 1;
                        } else if (j == 0) {
                            sum[i][0] = sum[i - 1][0] + 1;
                        } else {
                            sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1] + 1;
                        }
                    } else {
                        if (i == 0 && j == 0) {
                            sum[0][0] = 0;
                        } else if (i == 0) {
                            sum[0][j] = sum[0][j - 1];
                        } else if (j == 0) {
                            sum[i][0] = sum[i - 1][0];
                        } else {
                            sum[i][j] = sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1];
                        }
                    }
                    if (grid[i][j] == '0') {
                        int left = 0;
                        int top = 0;
                        if (i != 0) {
                            top = sum[i - 1][j];
                        }
                        if (j != 0) {
                            left = sum[i][j - 1];
                        }
                        int right = getRightestE(grid, i, j);
                        int bottom = getBottomE(grid, i, j);
                        max = Math.max(max, left + top + right + bottom);
                    }
                }
            }
            return max;
        }

        private int getBottomE(char[][] grid, int i, int j) {
            if (i == grid.length - 1) return 0;
            if (j == 0) {
                return sum[grid.length - 1][j] - sum[i][j];
            }
            return sum[grid.length - 1][j] - sum[i][j] + sum[i][j - 1] - sum[grid.length - 1][j - 1];
        }

        private int getRightestE(char[][] grid, int i, int j) {
            if (j == grid[0].length - 1) return 0;
            if (i == 0) {
                return sum[i][grid[0].length - 1] - sum[i][j];
            }
            return sum[i][grid[0].length - 1] - sum[i][j] + sum[i - 1][j] - sum[i - 1][grid[0].length - 1];
        }
    }

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