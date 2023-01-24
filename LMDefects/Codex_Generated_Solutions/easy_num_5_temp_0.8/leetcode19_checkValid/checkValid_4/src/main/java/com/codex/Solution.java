package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkValid(int[][] matrix) {
        /** An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
         * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
         */
        Set<Integer> set = new HashSet<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                set.add(matrix[row][col]);
            }
            if (set.size() < matrix.length) return false;
            set.clear();
        }
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                set.add(matrix[row][col]);
            }
            if (set.size() < matrix.length) return false;
            set.clear();
        }
        return true;
    }


    }