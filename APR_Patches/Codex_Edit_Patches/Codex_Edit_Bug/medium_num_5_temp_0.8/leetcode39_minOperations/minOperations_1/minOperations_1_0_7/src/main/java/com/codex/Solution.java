package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                min = Math.min(min, grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
        }
        if (max - min == 0) {
            return 0;
        }
        if (max - min < x) {
            return -1;
        }
        int target = max - (max - min) % x;
        int result = (max - target) / x;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < target) {
                    result += (target - grid[i][j]) / x;
                }
            }
        }
        return result;
    }
    public static int minOperations(int[][] grid, int x) {
        if (grid.length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        sum[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            sum[0][i] = sum[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            sum[i][0] = sum[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] + grid[i][j] - sum[i - 1][j - 1];
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= i; k++) {
                    for (int l = 0; l <= j; l++) {
                        int subSum;
                        if (k == 0 && l == 0) {
                            subSum = sum[i][j];
                        } else if (k == 0) {
                            subSum = sum[i][j] - sum[i][l - 1];
                        } else if (l == 0) {
                            subSum = sum[i][j] - sum[k - 1][j];
                        } else {
                            subSum = sum[i][j] - sum[i][l - 1] - sum[k - 1][j] + sum[k - 1][l - 1];
                        }
                        min = Math.min(min, subSum);
                        max = Math.max(max, subSum);
                    }
                }
            }
        }
        if (min == max) {
            return 0;
        }
        int target = max - (max - min) % x;
        int result = (max - target) / x;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= i; k++) {
                    for (int l = 0; l <= j; l++) {
                        int subSum;
                        if (k == 0 && l == 0) {
                            subSum = sum[i][j];
                        } else if (k == 0) {
                            subSum = sum[i][j] - sum[i][l - 1];
                        } else if (l == 0) {
                            subSum = sum[i][j] - sum[k - 1][j];
                        } else {
                            subSum = sum[i][j] - sum[i][l - 1] - sum[k - 1][j] + sum[k - 1][l - 1];
                        }
                        if (subSum < target) {
                            result += (target - subSum) / x;
                        }
                    }
                }
            }
        }
        return result;
    }

    
}