package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        boolean flag = false;
        for (int i = 0, j = grid.length - 1; i < grid.length; i++, j--) {
            for (int k = 0, l = grid[i].length - 1; k < grid[i].length; k++, l--) {
                if (i == j && k == l) {
                    if (grid[0][0] != grid[i][k]) {
                        flag = true;
                    }
                } else if (grid[0][0] != grid[i][k] || grid[0][0] != grid[j][l]) {
                    flag = true;            
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
        for (int i = 0, j = grid.length - 1; i < grid.length; i++, j--) {
            for (int k = 0, l = grid[i].length - 1; k < grid[i].length; k++, l--) {
                if (i == j && k == l) {
                    if (grid[0][0] != grid[i][k]) {
                        return -1;
                    }
                } else if (grid[0][0] != grid[i][k] || grid[0][0] != grid[j][l]) {
                    return -1;
                }
            }
        }
        return count;
    }

    
}