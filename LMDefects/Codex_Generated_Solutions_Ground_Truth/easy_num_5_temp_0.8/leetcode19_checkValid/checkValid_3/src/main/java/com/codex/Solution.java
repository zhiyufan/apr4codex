package com.codex;

import java.util.*;

public class Solution {
    public static boolean checkValid(int[][] matrix) {
        /** An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
         * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
         */
        Set<Integer> nums = new HashSet<>();
        for(int i = 0; i < matrix.length; i++) {
            nums.clear();
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > matrix.length || matrix[i][j] <= 0)
                    return false;
                if(nums.contains(matrix[i][j]))
                    return false;
                else
                    nums.add(matrix[i][j]);
            }
        }

        for(int i = 0; i < matrix[0].length; i++) {
            nums.clear();
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > matrix.length || matrix[j][i] <= 0)
                    return false;
                if(nums.contains(matrix[j][i]))
                    return false;
                else
                    nums.add(matrix[j][i]);
            }
       }