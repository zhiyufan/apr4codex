package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        long sum = 0;
        int m = grid[0].length;
        int n = grid.length;
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                sum += grid[0][i];
            }
        } else {
            int[] grid1 = new int[m];
            int[] grid2 = new int[m];
            for (int i = 0; i < m; i++) {
                grid1[i] = grid[0][i];
                grid2[i] = grid[1][i];
            }
            Arrays.sort(grid1);
            Arrays.sort(grid2);
            for (int i = 0; i < m; i++) {
                if (grid1[i] > grid2[i]) {
                    sum += grid2[i];
                } else {
                    sum += grid1[i];
                }
            }
        }
        return sum;
    }
}