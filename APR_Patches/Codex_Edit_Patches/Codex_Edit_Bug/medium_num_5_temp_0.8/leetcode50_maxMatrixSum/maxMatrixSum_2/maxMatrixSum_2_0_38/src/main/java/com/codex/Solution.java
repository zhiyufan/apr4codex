package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        int n = matrix.length;
        int[][] sums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sums[i][j] = matrix[i][j];
                if (i > 0) {
                    sums[i][j] += sums[i - 1][j];
                }
                if (j > 0) {
                    sums[i][j] += sums[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    sums[i][j] -= sums[i - 1][j - 1];
                }
            }
        }
        long maxSum = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = j; l < n; l++) {
                        int tempSum = sums[k][l];
                        if (i > 0) {
                            tempSum -= sums[i - 1][l];
                        }
                        if (j > 0) {
                            tempSum -= sums[k][j - 1];
                        }
                        if (i > 0 && j > 0) {
                            tempSum += sums[i - 1][j - 1];
                        }
                        maxSum = Math.max(maxSum, tempSum);
                    }
                }
            }
        }
        return maxSum;
    }
    
}