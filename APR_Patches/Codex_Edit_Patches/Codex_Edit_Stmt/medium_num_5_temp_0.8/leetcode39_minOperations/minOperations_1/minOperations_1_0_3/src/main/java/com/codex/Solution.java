package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            System.out.println(grid[i][grid[0].length - 1]);
            for (int j = 0; j < grid[0].length; j++) {
                min = Math.min(min, grid[i][j]);
                max = Math.max(max, grid[i][j]);
            }
        }
        if (max - min == 0) {
            return -1;
        }
        if (max - min < x) {
            return -1;
        }
        int t = (max - min) / x;
        int result = t;
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < grid.length; j++) {
                for (int k = 0; k < grid[0].length; k++) {
                    if (grid[j][k] >= (max - i * x) && grid[j][k] < max - (i - 1) * x) {
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }

}