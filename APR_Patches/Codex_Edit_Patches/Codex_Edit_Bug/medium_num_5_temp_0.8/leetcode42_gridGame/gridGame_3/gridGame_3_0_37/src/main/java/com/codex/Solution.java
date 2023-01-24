package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        

        int[] min;
        int[] max;
        for (int i = 1; i < grid.length; i++) {
            min = new int[grid[0].length];
            max = new int[grid[0].length];
            for (int j = 0; j < grid[0].length; j++) {
                if (j == 0) {
                    min[j] = grid[i][j];
                    max[j] = grid[i][j];
                } else {
                    min[j] = grid[i][j] + Math.min(min[j - 1], max[j - 1]);
                    max[j] = grid[i][j] + Math.max(min[j - 1], max[j - 1]);
            grid[i] = min;
                }
            }
        }
        return Math.max(grid[grid.length - 1][0], grid[grid.length - 1][1]);
    }
}