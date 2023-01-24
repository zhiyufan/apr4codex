package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int[] min = new int[grid[0].length];
        int[] max = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++)
            min[i] = grid[0][i];
        for (int i = 0; i < grid[0].length; i++)
            max[i] = grid[1][i];
        Arrays.sort(min);
        Arrays.sort(max);
        int sum = 0;
        boolean swap = true;
        for (int i = 0; i < grid[0].length; i++) {
            if (swap) {
                sum += max[i];
                swap = false;
            } else {
                sum += min[i];
                swap = true;
            }
        }
        return sum;
    }

    
}