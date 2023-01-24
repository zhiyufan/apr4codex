package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        /** You are given an n x n integer matrix. You can do the following operation any number of times:
         * Choose any two adjacent elements of matrix and multiply each of them by -1.
         * Two elements are considered adjacent if and only if they share a border.
         * Your goal is to maximize the summation of the matrix's elements. Return the maximum sum of the matrix's elements using the operation mentioned above.
         */
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
        return sums[n - 1][n - 1];
    }

    }