package com.codex;

import java.util.*;

public class Solution {
public static long maxMatrixSum(int[][] matrix) {
    
    int n = matrix.length;
    int[][] sums = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            sums[i][j] = matrix[i][j];
        }
    }
    for (int i = 1; i < n; i++) {
        sums[0][i] += sums[0][i - 1];
        sums[i][0] += sums[i - 1][0];
    }
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < n; j++) {
            sums[i][j] += Math.max(sums[i - 1][j], sums[i][j - 1]);
        }
    }
    int maxSum = sums[n - 1][n - 1];
    int maxSize = 1;
    for (int size = 2; size <= n; size++) {
        for (int i = 0; i < n - size + 1; i++) {
            for (int j = 0; j < n - size + 1; j++) {
                int sum = sums[i + size - 1][j + size - 1]
                        + sums[i][j] - sums[i + size - 1][j] - sums[i][j + size - 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSize = size;
                }
            }
        }
    }
    return maxSum;
}

    
}