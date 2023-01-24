package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int gridRow = grid.length;
        int gridCol = grid[0].length;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][0];
            min = Math.min(min, grid[i][0]);
        }
        if (!flag) {
            return 0;
        }
        int count = 0;
        if (grid[0][0] > x) {
            count += grid[0][0] - x;
            grid[0][0] = x;
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
            grid[0][0] = x;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != grid[0][0]) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}