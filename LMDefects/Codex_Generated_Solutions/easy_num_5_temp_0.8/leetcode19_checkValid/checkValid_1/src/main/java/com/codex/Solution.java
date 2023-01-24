package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkValid(int[][] matrix) {
        /** An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
         * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
         */
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            boolean[] row = new boolean[n+1];
            boolean[] col = new boolean[n+1];
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > n || row[matrix[i][j]]) {
                    return false;
                }
                row[matrix[i][j]] = true;
                if (matrix[j][i] < 1 || matrix[j][i] > n || col[matrix[j][i]]) {
                    return false;
                }
                col[matrix[j][i]] = true;
            }
        }
        return true;
    }
    }