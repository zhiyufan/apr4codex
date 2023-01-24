package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        
        int m = grid.length, n = grid[0].length;
        if (m == 0 || n == 0) return 0;
        int totalSum = 0, min = grid[0][0], max = grid[0][0];
        for (int[] row : grid) {
            for (int v : row) {
                totalSum += v;
                min = Math.min(min, v);
                max = Math.max(max, v);
            }
        }
        if ((max - min) % (x * m * n) != 0) return -1;
        int avg = (max + x * totalSum) / (m * n);
        int ans = 0;
        for (int[] row : grid) {
            for (int v : row) {
                if (v > avg) {
                    ans += v - avg;
                } else {
                    ans += avg - 1 - v;
                }
            }
        }
        return ans / x;
    }

    
}