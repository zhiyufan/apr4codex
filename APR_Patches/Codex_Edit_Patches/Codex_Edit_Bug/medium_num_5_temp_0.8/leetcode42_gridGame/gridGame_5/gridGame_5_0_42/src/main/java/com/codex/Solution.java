package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        if(grid.length == 0) {
            return 0l;
        }
        int m = grid[0].length;
        int[] grid1 = new int[m];
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        Arrays.sort(grid2);
        long sum = 0l;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += (long)grid2[i];
            } else {
                sum += (long)grid1[i];
            }
        }
        return sum;
    }
}