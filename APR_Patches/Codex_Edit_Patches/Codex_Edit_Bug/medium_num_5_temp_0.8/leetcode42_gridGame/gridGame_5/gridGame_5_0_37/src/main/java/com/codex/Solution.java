package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid, int k) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[] result = new int[m];
        for (int i = 0; i < k; i++) {
            int[][] nextGrid = new int[m][n];
            for (int j = 0; j < m; j++) {
                for (int w = 0; w < n; w++) {
                    nextGrid[j][w] = grid[j][w];
                    if (j - 1 >= 0) {
                        if (nextGrid[j][w] < grid[j - 1][w]) {
                            nextGrid[j][w] = grid[j - 1][w];
                        }
                    }
                    if (j + 1 < m) {
                        if (nextGrid[j][w] < grid[j + 1][w]) {
                            nextGrid[j][w] = grid[j + 1][w];
                        }
                    }
                    if (w - 1 >= 0) {
                        if (nextGrid[j][w] < grid[j][w - 1]) {
                            nextGrid[j][w] = grid[j][w - 1];
                        }
                    }
                    if (w + 1 < n) {
                        if (nextGrid[j][w] < grid[j][w + 1]) {
                            nextGrid[j][w] = grid[j][w + 1];
                        }
                    }
                }
            }
            grid = nextGrid;
        }
        
        for (int i = 0; i < m; i++) {            
            for (int j = 0; j < n; j++) {
                result[i] += grid[i][j];
            }
        }
        return sum;
    }

    
}