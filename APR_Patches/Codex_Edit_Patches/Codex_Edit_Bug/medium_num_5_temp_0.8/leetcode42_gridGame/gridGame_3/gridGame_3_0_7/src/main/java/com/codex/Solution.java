package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        

        int bestScore = 0;
        int[] min = new int[grid.length + 1];
        int[] max = new int[grid.length + 1];
        for (int j = 0; j < grid[0].length; j++) {
            max[0] = 0;
            for (int i = 1; i <= grid.length; i++) {
                max[i] = grid[i - 1][j] + Math.max(max[i - 1], min[i - 1]);
            bestScore = Math.max(bestScore, Math.max(max[grid.length], min[grid.length]));
                min[i] = grid[i - 1][j] + Math.min(max[i - 1], min[i - 1]);
            }
        }
        return bestScore;
    }

    
}