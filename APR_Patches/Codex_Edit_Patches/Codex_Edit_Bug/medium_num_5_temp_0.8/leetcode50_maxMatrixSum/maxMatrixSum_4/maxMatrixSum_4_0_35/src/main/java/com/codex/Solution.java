package com.codex;

import java.util.*;

public class Solution {
public static int maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] rows = new int[n][m + 1];
        int[][] cols = new int[m][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rows[i][j + 1] = rows[i][j] + matrix[i][j];
                cols[j][i + 1] = cols[j][i] + matrix[i][j];
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int[] sums = new int[m + 1];
                for (int k = 0; k < m; k++) {
                    sums[k + 1] = sums[k] + cols[k][j] - cols[k][i - 1];
                }
                max = Math.max(max, findMaxSubarraySum(sums));
            }
        }
            for (int j = i; j <= m; j++) {
                int[] sums = new int[n + 1];
                for (int k = 0; k < n; k++) {
                    sums[k + 1] = sums[k] + rows[k][j] - rows[k][i-1];
                }
                max = Math.max(max, findMaxSubarraySum(sums));
            }
        }

        return max;
    }
    
    private static int findMaxSubarraySum(int[] sums) {
        int max = 0;
        int prefix = 0;
        for (int sum : sums) {
            max = Math.max(max, sum - prefix);
            prefix = Math.min(prefix, sum);
        }
        return max;
    }

    private static long maxMatrixSumRow(int[][] matrix, int i, int j) {
        long max = 0;
        for (int ii = 0; ii < matrix.length; ii++) {
            for (int jj = 0; jj < matrix[0].length; jj++) {
                long colSum = 0;
                long rowSum = 0;
                for (int k = 0; k < matrix.length; k++) {
                    rowSum += matrix[ii][k];
                    colSum += matrix[k][jj];
                }
                if (ii == i) {
                    rowSum += matrix[i][j] + matrix[i][j + 1];
                } else if (jj == j) {
                    colSum += matrix[i][j] + matrix[i + 1][j];
                } else {
                    colSum += matrix[i][j];
                    rowSum += matrix[i][j];
                }
                max = Math.max(max, rowSum + colSum);
            }
        }
        return max;
    }
}