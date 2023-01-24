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
        return sums[n - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 2, 4, 2, 1, 2, 3, 2 },
            { 3, 3, 3, 2, 3, 2, 1 },
            { 2, 4, 2, 1, 2, 3, 2 },
            { 1, 2, 1, 2, 1, 2, 3 },
            { 2, 3, 4, 3, 5, 4, 2 },
            { 1, 2, 4, 5, 1, 2, 3 },
            { 1, 2, 1, 2, 1, 2, 1 }
        };
        long ans = maxMatrixSum(matrix);
        System.out.println("Answer is: " + ans);
    }
}