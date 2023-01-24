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
        long maxSum = Integer.MIN_VALUE;
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < n; j1++) {
                for (int i2 = i1; i2 < n; i2++) {
                    for (int j2 = j1; j2 < n; j2++) {
                        long sum = sums[i2][j2];
                        if (i1 > 0) {
                            sum -= sums[i1 - 1][j2];
                        }
                        if (j1 > 0) {
                            sum -= sums[i2][j1 - 1];
                        }
                        if (i1 > 0 && j1 > 0) {
                            sum += sums[i1 - 1][j1 - 1];
                        }
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
        }
        return maxSum;
    }

    
}