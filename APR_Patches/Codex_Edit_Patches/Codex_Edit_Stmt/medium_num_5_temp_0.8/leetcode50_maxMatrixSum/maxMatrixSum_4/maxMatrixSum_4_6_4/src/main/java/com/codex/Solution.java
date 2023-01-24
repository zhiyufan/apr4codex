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
                long colSum = 0;
                long rowSum = 0;
                for (int k = 0; k < matrix.length; k++) {
                    rowSum += matrix[ii][k];
                    colSum += matrix[k][jj];
                }
                if (ii == i) {
                    rowSum += matrix[ii][j] + matrix[ii][j + 1];
                } else if (jj == j) {
                    colSum += matrix[ii][j] + matrix[ii + 1][j];
                } else {
                    colSum += matrix[ii][jj];
                    rowSum += matrix[ii][jj];
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
                    rowSum += matrix[ii][j] + matrix[ii + 1][j];
                } else if (jj == j) {
                    colSum += matrix[ii][j] + matrix[ii][j + 1];
                } else {
                    rowSum += matrix[ii][j];
                }
                max = Math.max(max, rowSum + colSum);
            }
        }
        return max;
    }
}