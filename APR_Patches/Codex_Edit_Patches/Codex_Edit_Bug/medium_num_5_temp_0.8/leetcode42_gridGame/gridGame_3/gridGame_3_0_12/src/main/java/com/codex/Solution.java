package com.codex;

import java.util.*;

public class Solution {
    public static int gridGame(int[][] grid) {
        

       
        int[][] results = new int[grid.length][grid[0].length];

        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < results[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        results[i][j] = grid[i][j];
                    } else {
                        results[i][j] = grid[i][j] + results[i][j - 1];
                    }
                } else if (j == 0) {
                    results[i][j] = grid[i][j] + results[i - 1][j];
                } else {
                    results[i][j] = grid[i][j] + Math.max(results[i - 1][j], results[i][j - 1]);
                }
            }
        }
        return Math.max(min[grid[0].length - 1], max[grid[0].length - 1]);
    }

    
}