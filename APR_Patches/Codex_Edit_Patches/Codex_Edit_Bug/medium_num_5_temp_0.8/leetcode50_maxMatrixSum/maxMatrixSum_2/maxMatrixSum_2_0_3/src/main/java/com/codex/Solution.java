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
        int maxSum = Integer.MIN_VALUE;
        for (int left = 0; left < n; left++) {
            for (int right = left; right < n; right++) {
                int lineSum = 0;
                for (int row = 0; row < n; row++) {
                    int sum = sums[right][row];
                    if (left > 0) {
                        sum -= sums[left - 1][row];
                    }
                    lineSum += sum;
                    if (lineSum > maxSum) {
                        maxSum = lineSum;
                    }
                    if (lineSum < 0) {
                        lineSum = 0;
                    }
                }
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