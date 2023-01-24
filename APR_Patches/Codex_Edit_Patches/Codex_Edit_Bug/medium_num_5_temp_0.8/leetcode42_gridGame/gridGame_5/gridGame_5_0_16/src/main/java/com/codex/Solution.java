package com.codex;

import java.util.*;

public class Solution {
    public static long gridGame(int[][] grid) {
        
        int m = grid[0].length;
        int n = grid.length;
        int[] grid1 = new int[m];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[0][i];
        }
        Arrays.sort(grid1);
        int max = grid1[m-1];
        int min = grid1[0];
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[1][i];
        }
        Arrays.sort(grid1);
        if (grid1[m-1] > max) {
            max = grid1[m-1];
        } 
        if (grid1[0] < min) {
            min = grid1[0];
        }
        int[] grid2 = new int[m];
        for (int i = 0; i < m; i++) {
            grid2[i] = grid[1][i];
        }
        Arrays.sort(grid2);
        if (grid2[m-1] > max) {
            max = grid2[m-1];
        } 
        if (grid2[0] < min) {
            min = grid2[0];
        }
        for (int i = 0; i < m; i++) {
            grid1[i] = grid[2][i];
        }
        Arrays.sort(grid1);
        if (grid1[m-1] > max) {
            max = grid1[m-1];
        } 
        if (grid1[0] < min) {
            min = grid1[0];
        }
        int[] grid3 = new int[m];
        for (int i = 0; i < m; i++) {
            grid3[i] = grid[3][i];
        }
        Arrays.sort(grid3);
        if (grid3[m-1] > max) {
            max = grid3[m-1];
        } 
        if (grid3[0] < min) {
            min = grid3[0];
        }
        int[] grid4 = new int[m];
        for (int i = 0; i < m; i++) {
            grid4[i] = grid[4][i];
        }
        Arrays.sort(grid4);
        if (grid4[m-1] > max) {
            max = grid4[m-1];
        } 
        if (grid4[0] < min) {
            min = grid4[0];
        }
        int distance = max - min;
        int[] grid5 = new int[m];
        for (int i = 0; i < m; i++) {
            grid5[i] = grid[5][i];
        }
        Arrays.sort(grid5);
        if (grid5[m-1] > max) {
            max = grid5[m-1];
        } 
        if (grid5[0] < min) {
            min = grid5[0];
        }
        if (distance > max - min) {
            distance = max - min;
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += grid[0][i] + grid[1][i] + grid[2][i] + grid[3][i] + grid[4][i] + grid[5][i];
        }
        return sum - distance;
    }

    
}