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
            count += grid[0][0] - x;
            grid[0][0] = x;
        } else if (grid[0][0] < x) {
            count += (x - grid[0][0]) / x + ((x - grid[0][0]) % x == 0 ? 0 : 1);
            grid[0][0] = x;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != grid[0][0]) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}