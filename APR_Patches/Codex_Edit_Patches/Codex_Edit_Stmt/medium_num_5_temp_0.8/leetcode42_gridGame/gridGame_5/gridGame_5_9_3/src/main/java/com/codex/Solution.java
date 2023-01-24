package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        int[] grid1 = new int[m];
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        int sum = 0;
        if (grid1[0] > grid2[0]) {
            sum += grid2[0];
        } else {
            sum += grid1[0];
        }
        for (int i = 1; i < m; i++) {
            if (grid1[i] > grid2[i - 1]) {
                sum += grid2[i - 1];
            }
            else {
                sum += grid1[i];
            }
        }
        return sum;
    }

}