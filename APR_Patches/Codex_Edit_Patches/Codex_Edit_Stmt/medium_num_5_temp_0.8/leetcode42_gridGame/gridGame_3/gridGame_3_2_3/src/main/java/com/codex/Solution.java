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
                int candidate1 = grid[0][i] + (i > 1 ? min[i - 2] : 0);
                int candidate2 = grid[0][i] + (i > 1 ? max[i - 2] : 0);
                min[i] = Math.min(candidate1, candidate2);
                max[i] = grid[1][i] + Math.max(min[i - 1], max[i - 1]);
            }
        }
        return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]);
    }
}