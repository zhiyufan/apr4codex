package com.codex;

import java.util.*;

public class Solution {
      public static long gridGame(int[][] grid) {
        
        int n = grid[0].length;
        int[] grid1 = new int[n];
        int[] grid2 = new int[n];
        for (int i = 0; i < n; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

    
}