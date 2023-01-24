package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        

        long[] min = new long[grid[0].length];
        long[] max = new long[grid[0].length];
        for (int column = 0; column < grid[0].length; column++) {
            if (column == 0) {
                min[column] = grid[0][column];
                max[column] = grid[1][column];
            } else {
                min[column] = grid[0][column] + Math.min(min[column - 1], max[column - 1]);
                max[column] = grid[1][column] + Math.max(min[column - 1], max[column - 1]);
            }
        }
        for (int row = 2; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (column == 0) {
                    min[column] = grid[row][column] + Math.min(min[column], max[column]);
                    max[column] = grid[row][column] + Math.max(min[column], max[column]);
                } else {
                    min[column] = grid[row][column] + Math.min(min[column], max[column]);
                    max[column] = grid[row][column] + Math.max(min[column], max[column]);
                }
            }
        }
        long maxValue = 0;
        for (int column = 0; column < grid[0].length; column++) {
            maxValue = Math.max(maxValue, Math.max(min[column], max[column]));
        }
        return maxValue;
    }
}