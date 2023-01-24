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
        for (int i = 0; i < m; i++) {
            if (grid1[i] > grid2[i]) {
                sum += grid2[i];
            } else {
                sum += grid1[i];
            }
        }
        return sum;
    }
static void rotate(int[][] matrix) {
        int n = matrix.length;
        int lo = 0;
        int hi = n - 1;
        while (lo < hi) {
            for(int i = 0; i < hi - lo; i++) {
                swap(matrix, lo, lo + i, hi - i, lo);
                swap(matrix, lo + i, hi, hi, hi - i);
                swap(matrix, hi, hi - i, lo, lo + i);
            }
            lo++;
            hi--;
        }
    }

    static void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    
}