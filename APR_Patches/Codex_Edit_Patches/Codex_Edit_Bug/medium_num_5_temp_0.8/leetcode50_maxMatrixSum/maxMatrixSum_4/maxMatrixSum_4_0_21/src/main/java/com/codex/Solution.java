package com.codex;

import java.util.*;

public class Solution {

    public static long maxMatrixSum(long[][] matrix) {
        
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

    private static long maxMatrixSumRow(long[][] matrix, int i, int j) {
        long max = 0;
        for (int ii = 0; ii < matrix.length; ii++) {
            for (int jj = 0; jj < matrix[0].length; jj++) {
                long colSum = 0;
                long rowSum = 0;
                for (int k = 0; k < matrix.length; k++) {
                    if (ii == i || (ii == i + 1 && jj == j)) {
                        rowSum += matrix[ii][k];
                        if (jj != j) {
                            rowSum += matrix[i][j] + matrix[i][j + 1];
                        }
                    } else {
                        rowSum += matrix[ii][k];
                    }
                    if (jj == j || (jj == j + 1 && ii == i)) {
                        colSum += matrix[k][jj];
                        if (ii != i) {
                            colSum += matrix[i][j] + matrix[i + 1][j];
                        }
                    } else {
                        colSum += matrix[k][jj];
                    }
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
                    if (ii == i) {
                        rowSum += matrix[ii][k];
                        if (jj != j) {
                            rowSum += matrix[i][j] + matrix[i + 1][j];
                        }
                    } else if (ii == i + 1 && jj == j) {
                        rowSum += matrix[i][j];
                    } else {
                        rowSum += matrix[ii][k];
                    }
                    if (jj == j) {
                        colSum += matrix[k][jj];
                        if (ii != i) {
                            colSum += matrix[i][j] + matrix[i][j + 1];
                        }
                    } else if (jj == j + 1 && ii == i) {
                        colSum += matrix[i][j];
                    } else {
                        colSum += matrix[k][jj];
                    }
                }
                max = Math.max(max, rowSum + colSum);
            }
        }
        return max;
    }
}