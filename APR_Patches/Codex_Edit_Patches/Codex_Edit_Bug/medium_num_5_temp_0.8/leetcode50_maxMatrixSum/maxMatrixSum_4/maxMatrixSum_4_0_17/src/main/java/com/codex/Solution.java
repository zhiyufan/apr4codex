package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        long max = Long.MIN_VALUE;
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
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, maxMatrixSumCol(matrix, i, j));
            }
        }

        return max;
    }

    private static long maxMatrixSumRow(int[][] matrix, int row, int col) {
        long max = Long.MIN_VALUE;
        for (int ii = 0; ii < matrix.length; ii++) {
            for (int jj = 0; jj < matrix[0].length; jj++) {
                long colSum = 0;
                long rowSum = 0;
                for (int k = 0; k < matrix.length; k++) {
                    rowSum += matrix[ii][k];
                    colSum += matrix[k][jj];
                }
                if (ii == row) {
                    rowSum += matrix[row][col] + matrix[row][col + 1];
                } else if (jj == col) {
                    colSum += matrix[row][col] + matrix[row + 1][col];
                } else {
                    colSum += matrix[row][col];
                    rowSum += matrix[row][col];
                }
                max = Math.max(max, rowSum + colSum);
            }
        }
        return max;
    }

    private static long maxMatrixSumCol(int[][] matrix, int row, int col) {
        long max = Long.MIN_VALUE;
        for (int ii = 0; ii < matrix.length; ii++) {
            for (int jj = 0; jj < matrix[0].length; jj++) {
                long colSum = 0;
                long rowSum = 0;
                for (int k = 0; k < matrix.length; k++) {
                    rowSum += matrix[ii][k];
                    colSum += matrix[k][jj];
                }
                if (ii == row) {
                    rowSum += matrix[row][col] + matrix[row + 1][col];
                } else if (jj == col) {
                    colSum += matrix[row][col] + matrix[row][col + 1];
                } else {
                    colSum += matrix[row][col];
                    rowSum += matrix[row][col];
                }
                max = Math.max(max, rowSum + colSum);
            }
        }
        return max;
    }
}