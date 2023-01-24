package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkValid(int[][] matrix) {
        /** An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
         * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
         */
        Set<Integer> set = new HashSet<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                set.add(matrix[i][j]);
            }
            if (set.size() != i+1) {
                return false;
            }
            set.clear();
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                set.add(matrix[j][i]);
            }
            if (set.size() != i+1) {
                return false;
            }
            set.clear();
        }
        return true;
    }

    }