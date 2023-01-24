package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int[][] sums = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sums[i][j] = matrix[i][j];
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= 2) {
                    sums[i][j] += matrix[i][j] + sums[i - 2][j];
                } else if (j >= 2) {
                    sums[i][j] += matrix[i][j] + sums[i][j - 2];
                }
                max = Math.max(max, sums[i][j]);
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                sums[i][j] += Math.max(sums[i - 1][j], sums[i][j - 1]);
            }
        }
        return sums[n - 1][n - 1];
    }

    
}