package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;        
        int[][] sum = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    sum[i][j] = grid[i][j];
                } else if (i == 0) {
                    sum[i][j] = sum[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    sum[i][j] = sum[i - 1][j] + grid[i][j];
                } else {
                    sum[i][j] = Math.max(sum[i][j - 1] + grid[i][j], sum[i - 1][j] + grid[i][j]);
                }
            }
        }
        return sum[n - 1][m - 1];
    }

    
}