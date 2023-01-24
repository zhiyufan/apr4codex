package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                numberOfOperations += Math.abs(grid[i][j] - x) / x;
            }
        }
        return numberOfOperations;
    }

    
}