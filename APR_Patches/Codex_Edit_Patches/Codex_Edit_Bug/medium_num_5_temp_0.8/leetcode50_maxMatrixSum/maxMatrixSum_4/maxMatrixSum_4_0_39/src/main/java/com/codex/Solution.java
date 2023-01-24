package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        if (matrix.length == 1) {
            long max = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    max += Math.abs(matrix[i][j]);
                }
            }
            return max;
        }
        long max = 0;
        long[][] rowSum = new long[matrix.length][matrix[0].length];
        long[][] colSum = new long[matrix.length][matrix[0].length];
        // calculate row and column sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum[i][j] = matrix[i][j];
                if (j > 0) {
                    rowSum[i][j] += rowSum[i][j - 1];
                }
                colSum[i][j] = matrix[i][j];
                if (i > 0) {
                    colSum[i][j] += colSum[i - 1][j];
                }
            }
        }
        // sum of absolute value
        for (int i = 0; i < matrix.length; i++) {
            max += Math.abs(matrix[i][0]);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                max = Math.max(max, maxMatrixSumRow(matrix, i, j));
            }
        }
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                max = Math.max(max, maxMatrixSumCol(matrix, i, j));
            }
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

    private static long maxMatrixSumCol(int[][] matrix, int i, int j) {
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
                    rowSum += matrix[i][j] + matrix[i + 1][j];
                } else if (jj == j) {
                    colSum += matrix[i][j] + matrix[i][j + 1];
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