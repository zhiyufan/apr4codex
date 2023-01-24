package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int target) {
        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == target) continue;
                if (grid[i][j] < target) {
                    if ((target - grid[i][j]) % target != 0) return -1;
                    numberOfOperations += (target - grid[i][j]) / target;
                } else {
                    if ((grid[i][j] - x) % x != 0)  return -1;
                    numberOfOperations += (grid[i][j] - x) / x;
                }
            }
        }
        return numberOfOperations;
    }

    
}