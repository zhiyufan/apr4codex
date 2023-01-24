package com.codex;

import java.util.*;

public class Solution {
public static int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        if (m == 0 || n == 0) return 0;
        int left = 1;
        int right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isFeasible(grid, x, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left == Integer.MAX_VALUE ? -1 : left;
    }
    
    private static boolean isFeasible(int[][] grid, int x, int target) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sums = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + grid[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = i; j <= m; j++) {
                int minDiff = Integer.MAX_VALUE;
                int maxDiff = Integer.MIN_VALUE;
                for (int k = 1; k <= n; k++) {
                    int sum = sums[j][k] - sums[j][k - 1] - sums[i - 1][k] + sums[i - 1][k - 1];
                    minDiff = Math.min(minDiff, sum);
                    maxDiff = Math.max(maxDiff, sum);
                    if ((sum - minDiff) % x == 0 && (maxDiff - sum) % x == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}