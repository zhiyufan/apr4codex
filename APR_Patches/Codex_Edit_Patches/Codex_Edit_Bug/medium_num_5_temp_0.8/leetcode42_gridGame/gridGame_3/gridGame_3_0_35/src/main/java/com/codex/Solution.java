package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        

        int[] min = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            min[i] = Math.min(grid[0][i], grid[1][i]);
        }
        int max = 0;
        for (int i = 0;i < grid.length; i++) {
            max = Math.max(min[i], max);
        }
        return max;
    }

    
}