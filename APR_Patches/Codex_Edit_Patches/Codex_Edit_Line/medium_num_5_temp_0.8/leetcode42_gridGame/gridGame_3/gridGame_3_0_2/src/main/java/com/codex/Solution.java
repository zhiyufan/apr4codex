package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        

        int[] mini = new int[grid[0].length];
        int[] max = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            if (i == 0) {
                mini[i] = grid[0][i];
                max[i] = grid[1][i];
            } else {
                mini[i] = grid[0][i] + Math.min(mini[i - 1], max[i - 1]);
                max[i] = grid[1][i] + Math.max(mini[i - 1], max[i - 1]);
            }
        }
        return Math.max(mini[grid[0].length - 1], max[grid[0].length - 1]);
    }

    
}