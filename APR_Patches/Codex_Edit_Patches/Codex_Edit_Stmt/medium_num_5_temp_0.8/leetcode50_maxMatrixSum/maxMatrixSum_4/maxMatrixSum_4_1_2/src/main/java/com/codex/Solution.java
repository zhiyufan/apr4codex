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

public static void main(String[] args) {
        
        int[][] matrix = {
            {7, -8, -5, -4,  5, -4, -4,  6,  8, -2, -2,  7,  5, -1,  9, -9, -2, -8,  4, -4,  6, -6, -4,  2,  1,  5,  2, -2, -8,  8,  7,  8, -6, -1,  6,  9, -4,  1,  7, -4,  3,  5,  2, -4, -8,  3,  3,  0, -1, -5,  6, -5,  6, -7, -3,  1,  0,  0,  0, -5, -8,  4,  7,  1, -2, -8,  6, -7, -2,  1, -1, -5, -3, -5,  6,  6,  2,  9,  0, -5, -1, -5, -1, -7, -2,  3, -6, -8, -9,  4,  6,  4,  2,  9, -6,  4,  2,  5,  4, -3, -4,  9, -4, -8, -2,  0, -6,  6, -8,  7, -3, -1, -4, -4, -8, -2, -2, -4, -7, -8,  9,  0, -9, -2,  6, -4,  7, -6, -1, -8, -8, -6, -9,  1, -7},
            {-6,  4, -2,  1, -6, -9, -2,  6,  8, -5,  0, -3,  4, -5,  2,  5,  4,  9, -8,  4,  1,  3, -2,  4,  1, -7, -1, -4,  4,  0,  7,  1,  8,  9,  8,  5,  8,  8, -9,  8,  0, -1, -1,  8, -6,  3, -2, -7,  3,  9, -1,  0, -6,  5, -1,  1,  5, -5, -2,  3,  4, -1,  8,  4,  5,  7,  8,  8, -7, -9, -9,  8,  6,  7,  6,  6,  6, -2,  9,  3,  5,  7,  0,  3, -7,  2,  9,  7, -3,  1, -9,  6,  1, -8,  9,  1,  3,  2,  4,  1, -7,  5,  4,  7, -2, -2, -4,  2, -4, -8, -4,  7,  6,  8,  5, -8, -9, -2,  8,  2, -1, -6, -2,  3, -9, -6,  4,  7, -5,  8, -8,  0,  0},
            {7,  7, -3, -3, -5,  2, -5, -8,  0, -2, -9,  8,  0, -3, -1,  5,  1,  9, -2, -7, -6, -2, -9,  5, -6,  9, -1,  1,  4,  1, -7, -9,  7,  9, -8, -7,  3,  3, -2, -8,  0, -2, -1,  4,  3,  0, -4, -4,  7,  9, -3, -4,  4, -9,  6, -5,  0,  0,  7,  5, -6,  9,  3, -7, -6,  3,  7, -1,  6, -5,  6,  4,  5,  1,  2,  5, -6,  9,  0,  3,  3, -2, -1,  5, -9,  9,  2,  1,  4,  0,  7,  5,  7,  9,  4, -9,  5,  2,  9,  0,  4, -4,  6,  4,  5,  2, -9, -6,  8, -9, -8, -6, -2, -2,  9, -8,  3, -9,  6,  0,  0,  0,  9,  5, -7,  7,  4, -6, -5,  6,  9, -3},
            {1,  1,  3,  5,  3,  3, -2,  9,  0, -1,  7,  4,  5, -7, -8,  1, -9, -5,  7,  0,  0,  8, -1,  8,  8, -2,  7,  1,  4, -7, -2,  9,  8,  5, -4, -4,  8,  1,  2,  9,  1, -8,  2,  3,  3, -7, -8,  8, -9,  8,  9,  0, -8,  3, -2,  2,  3, -1,  9, -4, -1,  3,  0,  7, -7,  5,  9,  2, -3,  0, -5,  7,  0, -3,  4,  2,  5, -6, -2,  1, -7, -6,  4,  0, -1,  4, -5,  7,  4, -6, -1, -5,  1,  3,  2,  9, -6,  6,  7,  4,  5, -7, -3,  9, -9, -5, -2, -5,  6, -7, -3,  9, -2,  5,  7,  1,  4,  0,  2, -4,  7,  5, -9,  6,  6,  1, -1,  9, -1,  6,  2,  3}
        };

        System.out.println(maxMatrixSum(matrix));
    }
}