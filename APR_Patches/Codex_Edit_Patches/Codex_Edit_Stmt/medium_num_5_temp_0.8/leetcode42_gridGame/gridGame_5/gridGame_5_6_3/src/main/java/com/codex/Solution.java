package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] grid = new int[2][2];
        grid[0][0] = 2;
        grid[0][1] = 2;
        grid[1][0] = 2;
        grid[1][1] = 2;
        System.out.println(gridGame(grid));
    }


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
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }

    
}