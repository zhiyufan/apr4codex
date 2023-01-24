package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid, int i, int[] min, int[] max) {
        if (i >= 0) {
            min[i] = grid[0][i] + Math.min(gridGame(grid, i - 1, min, max), gridGame(grid, i - 1, min, max));
            max[i] = grid[1][i] + Math.max(gridGame(grid, i - 1, min, max), gridGame(grid, i - 1, min, max));
            return Math.max(min[i], max[i]);
        } else {
            return 0;
        }
    }

    
}