package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        

        int[][] results = new int[grid.length][grid[0].length];
        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[0].length; j++) {
                results[i][j] = 0;
            }
        }
        return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]);
    }

    
}