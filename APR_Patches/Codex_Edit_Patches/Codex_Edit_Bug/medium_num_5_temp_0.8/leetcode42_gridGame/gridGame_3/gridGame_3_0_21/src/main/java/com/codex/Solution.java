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
        for (int i = 1; i < grid.length - 1; i++) {
            int[] tempMin = new int[grid[0].length];
            int[] tempMax = new int[grid[0].length];
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    tempMin[j] = grid[i][j] + Math.min(min[j], max[j]);
                    tempMax[j] = grid[i][j] + Math.max(min[j], max[j]);
                } else {
                    tempMin[j] = grid[i][j] + Math.min(min[j], Math.min(tempMin[j - 1], tempMax[j - 1]));
                    tempMax[j] = grid[i][j] + Math.max(max[j], Math.max(tempMin[j - 1], tempMax[j - 1]));
                }
            }
            min = tempMin;
            max = tempMax;
        }


            }

        }
        return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]);
    }
}