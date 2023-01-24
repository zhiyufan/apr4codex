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
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] < max) {
                    min += grid[i][j];
                } else {
                    min += grid[i][j] - max;
                }
            }
        }
        if (max == min) {
            return 0;
        }
        if (max > x || min > x) {
            return -1;
        }
        int result = -1;
        while (min <= x) {
            int temp = min;
            min += max;
            result++;
        }
        return result;
    }    
}