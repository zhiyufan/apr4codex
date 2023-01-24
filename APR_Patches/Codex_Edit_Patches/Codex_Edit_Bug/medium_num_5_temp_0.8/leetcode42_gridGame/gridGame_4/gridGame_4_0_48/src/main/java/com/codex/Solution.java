package com.codex;

import java.util.*;

public class Solution {
    static int[] first = new int[grid[0].length];
    static int[] second = new int[grid[0].length];
    
    public static long gridGame(int[][] grid) {
        if (grid.length <= 2) {
            return findmax(grid);
        }
        int[][] grid2 = new int[grid.length - 1][];
        for (int i = 0; i < grid.length - 1; i++) {
            int[] row = new int[grid[0].length];
            for (int j = 0; j < grid[0].length; j++) {
                int x = Math.max(grid[i][j], grid[i + 1][j]);
                row[j] = x;
            }
        }
        return sum;
    }

    
}