package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        int n = matrix.length;
        int[][] sums = new int[n][n];
        for (int i = 0; i < n; i++) {
            sums[i][0] = matrix[i][0];
            for (int j = 0; j < n; j++) {
                sums[0][j] = matrix[0][j];
            }
        }
        for (int i = 1; i < n; i++) {
            sums[0][i] += sums[0][i - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sums[i][j] += Math.max(sums[i - 1][j], sums[i][j - 1]);
            }
        }
        return sums[n - 1][n - 1];
    }

    
}