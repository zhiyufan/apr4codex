package com.codex;

import java.util.*;

public class Solution {
public static long gridGame(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
         int[] min = new int[grid[0].length];
         int[] max = new int[grid[0].length];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (j == 0) {
                    min[j] = grid[i][j];
                    max[j] = grid[i][j];
                } else {
                    min[j] = grid[i][j] + Math.min(min[j - 1], max[j - 1]);
                    max[j] = grid[i][j] + Math.max(min[j - 1], max[j - 1]);
                }
            }
        }
        return Math.max(min[numCols - 1], max[numCols - 1]);
    }
}