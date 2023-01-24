package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        System.out.print(grid[0].length);

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
    }

    
}