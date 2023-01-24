package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        boolean[] flag = new boolean[grid[0].length];
        
        int sum = 0;
        
        for (int i = 0; i < grid.length; i++) {
            int max = -1;
            int index = -1;
            for (int j = 0; j < grid[0].length; j++) {
                if (!flag[j] && grid[i][j] > max) {
                    max = grid[i][j];
                    index = j;
                }
            }
            if (max != -1) {
                sum += max;
                flag[index] = true;
            }
        }
        return sum;
    }

    
}