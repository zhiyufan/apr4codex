package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int sum = 0;
                if (grid.length-1 != i && grid[0].length-1 != j) {
                    if (grid[i+1][j] > grid[i][j+1]) {
                        sum += grid[i+1][j];
                    } else {
                        sum += grid[i][j+1];
                    }
                }
                result[i][j] = sum;
            }
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

    
}