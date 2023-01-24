package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] < x) {
                    if ((x - grid[i][j]) % grid[i][j] != 0) return -1;
                    numberOfOperations += (x - grid[i][j]) / grid[i][j];
                } else {
                    if ((grid[i][j] - x) % grid[i][j] != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / grid[i][j];
                }
            }
        }
        return numberOfOperations;
    }

    
}