package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        

        int[] min = new int[grid[0].length];
        int[] max = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            if (i == 0) {
                min[i] = grid[0][i];
                max[i] = grid[1][i];
            } else {
                min[i] = grid[0][i] + Math.min(min[i - 1], max[i - 1]);
                max[i] = grid[1][i] + Math.max(min[i - 1], max[i - 1]);
            }
        }
        return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]);
    public static long gridGame(int[][] grid) {
        
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for (int j = 0; j < grid[0].length; j++) {
            if (j == 0) {
                min = grid[0][j];
                max = grid[1][j];
            } else {
                long tempMin = grid[0][j] + Math.min(min, max);
                long tempMax = grid[1][j] + Math.max(min, max);
                min = tempMin;
                max = tempMax;
            }
        }
        return Math.max(min, max);
    }
    }

    
}