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
            for (int jj = 0; jj < matrix[0].length - 1; jj++) {
                long colSum = 0;
                long rowSum = 0;
                }
                for (int k = 0; k < matrix.length - 1; k++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    rowSum += matrix[ii][k];
                    colSum += matrix[k][jj];
                }
                if (jj == j) {
                    colSum += matrix[i][j] + matrix[i][j + 1];
                }
                if (ii == i && jj == j) {
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
                for (int k = 0; k < matrix.length - 1; k++) {
                    colSum += matrix[k][jj];
                }
            for (int jj = 0; jj < matrix[0].length; jj++) {
                long colSum = 0;
                long rowSum = 0;
                for (int k = 0; k < matrix[0].length - 1; k++) {
                    rowSum += matrix[ii][k];
                }
                if (jj == j + 1) {
                    rowSum += matrix[i][j] + matrix[i + 1][j];
                } else if (jj == j) {
                    rowSum += matrix[i][j];
                } else {
                if (ii == i + 1 && jj == j) {
                    colSum += matrix[i][j];
                }
                if (ii == i && jj == j) {
                    rowSum += matrix[i][j];
                }
                max = Math.max(max, rowSum + colSum);
            }
        }
        return max;
    }







    public static void main(String[] args) {
        int[][] matrix = {
            {239, 220, -367, -845, -579, -863, -355, -939, -972, -750},
            {-920, -845, -822, -588, -919, -914, -426, -983, -351, -482},
            {-394, -193, -883, -385, -876, -833, -803, -840, -108, -824},
            {-743, -653, -947, -906, -359, -209, -421, -824, -420, -542},
            {-912, -569, -504, -198, -258, -814, -702, -902, -617, -934},
            {-512, -143, -993, -834, -226, -735, -458, -465, -974, -971},
            {-803, -147, -708, -632, -455, -915, -977, -728, -742, -148},
            {-858, -579, -974, -994, -973, -939, -770, -667, -962, -865},
            {-100, -140, -859, -931, -726, -264, -38, -822, -890, -285},
            {-403, -907, -840, -748, -657, -873, -882, -28, -929, -947}
        };
        System.out.println(maxMatrixSum(matrix));
    }
}