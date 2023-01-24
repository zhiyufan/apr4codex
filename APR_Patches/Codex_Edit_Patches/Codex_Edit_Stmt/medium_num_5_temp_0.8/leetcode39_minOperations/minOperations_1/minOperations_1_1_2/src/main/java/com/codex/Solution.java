package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
        }
        if (max == min) {
            return 0;
        }
        if (max - min < x || x == 1) {
            return -1;
        }
        int result = 0;
        int target = max - x;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                while (target > grid[i][j]) {
                    result++;
                    target -= x;
                }
            }
        }
        return result;
    }

    
}