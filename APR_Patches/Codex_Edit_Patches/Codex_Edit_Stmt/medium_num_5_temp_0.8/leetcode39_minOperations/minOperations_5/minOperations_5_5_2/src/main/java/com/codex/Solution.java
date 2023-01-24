package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        boolean flag = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[0][0] != grid[i][j]) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            return 0;
        }
        int count = 0;
        if (grid[0][0] > x) {
            if ((grid[0][0] - x) % 2 == 1) {
                return -1;
            } else {
                count += (grid[0][0] - x) / 2;
                grid[0][0] = x;
            }
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]);
            grid[0][0] = x;
        }

        for (int i = 1; i < grid.length; i++) {
            if (grid[i][0] > grid[i - 1][0]) {
                return -1;
            } else if (grid[i][0] < grid[i - 1][0]) {
                count += grid[i - 1][0] - grid[i][0];
                grid[i][0] = grid[i - 1][0];
            }
        }
        for (int j = 1; j < grid[0].length; j++) {
            if (grid[0][j] > grid[0][j - 1]) {
                return -1;
            } else if (grid[0][j] < grid[0][j - 1]) {
                count += grid[0][j - 1] - grid[0][j];
                grid[0][j] = grid[0][j - 1];
            }
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                if (grid[i][j] < Math.min(grid[i - 1][j], grid[i][j - 1])) {
                    return -1;   
                } else if (grid[i][j] > Math.min(grid[i - 1][j], grid[i][j - 1])) {
                    count += grid[i][j] - Math.min(grid[i - 1][j], grid[i][j - 1]);
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]);   
                }
            }
        }
        return count;
    }

    
}