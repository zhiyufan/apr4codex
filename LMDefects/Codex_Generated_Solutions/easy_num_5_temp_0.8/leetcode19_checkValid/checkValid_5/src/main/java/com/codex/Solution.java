package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkValid(int[][] matrix) {
        /** An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
         * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
         */
        int n = matrix.length;
        boolean[] valid = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                valid[matrix[i][j] - 1] = true;
            }
            for (int k = 0; k < n; k++) {
                if (!valid[k]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                valid[matrix[j][i] - 1] = true;
            }
            for (int k = 0; k < n; k++) {
                if (!valid[k]) {
                    return false;
                }
            }
        }
        return true;
    }
}}