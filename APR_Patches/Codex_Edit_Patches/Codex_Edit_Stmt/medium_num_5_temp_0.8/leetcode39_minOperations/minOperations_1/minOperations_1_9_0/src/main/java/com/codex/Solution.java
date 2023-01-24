package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
        }

        if (max == 0) {
            return 0;
        }
        if (max < x) {
            return -1;
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += (max - grid[i][j]) / x;

                if ((max - grid[i][j]) % x != 0) {
                    result++;
                }
            }
        }

        return result;
        
       }

    
}