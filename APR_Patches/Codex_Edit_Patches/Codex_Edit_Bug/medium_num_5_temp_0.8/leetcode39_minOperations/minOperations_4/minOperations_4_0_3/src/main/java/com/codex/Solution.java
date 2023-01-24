package com.codex;

import java.util.*;

public class Solution {
    static int minOperations(int[][] grid, int x) {
        
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count = count + Math.abs(grid[i][j] - x);
            }
        }
        return count / 2;
    }

    public static int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if (grid[i][j] < x) {
                    if ((x - grid[i][j]) % x != 0) return -1;
                    numberOfOperations += (x - grid[i][j]) / x;
                } else {
                    if ((grid[i][j] - x) % x != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / x;
                }
            }
        }
        return numberOfOperations;
    }

    
}