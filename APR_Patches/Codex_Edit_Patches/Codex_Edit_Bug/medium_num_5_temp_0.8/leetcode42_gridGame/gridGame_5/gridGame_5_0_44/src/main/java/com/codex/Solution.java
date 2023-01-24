package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        long sum = 0;
        long max1 = 0;
        long max2 = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < m; i++) {
                if (max1 < grid[0][i]) {
                    max1 = grid[0][i];
                }
                if (max2 < grid[1][i]) {
                    max2 = grid[1][i];
                }
            }
            if (max1 > max2) {
                sum += max2;
            } else {
                sum += max1;
            }
            max1 = 0;
            max2 = 0;
        }
        return sum;
    }

    
}