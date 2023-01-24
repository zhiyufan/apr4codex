package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        long max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max += Math.abs(matrix[i][j]);
            }
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
                long colSum = maxColSum(matrix, i, jj);
                long rowSum = maxRowSum(matrix, ii, j);
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
                long colSum = maxColSum(matrix, i, jj);
                long rowSum = maxRowSum(matrix, ii, j);
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

    private static long maxColSum(int[][] matrix, int i, int j) {
        long sum = 0;
        for (int k = 0; k < matrix.length; k++) {
            sum += matrix[k][j];
        }
        return sum;
    }

    private static long maxRowSum(int[][] matrix, int i, int j) {
        long sum = 0;
        for (int k = 0; k < matrix[0].length; k++) {
            sum += matrix[i][k];
        }
        return sum;
    }
}