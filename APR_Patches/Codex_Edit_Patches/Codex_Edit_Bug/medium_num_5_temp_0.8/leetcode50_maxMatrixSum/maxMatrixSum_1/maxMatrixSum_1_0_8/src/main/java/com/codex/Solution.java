package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        long sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }

        List<Integer> rowsForSwap = new ArrayList<>();
        List<Integer> colsForSwap = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int row = 0, col = 0;
            for (int[] ints : matrix) {
                row += ints[i];
            }
            for (int[] ints : matrix) {
                col += ints[i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            sum += rowsForSwap.get(i) % 2 == 0 ? 0 : -2 * matrix[i][0];
            sum += colsForSwap.get(i) % 2 == 0 ? 0 : -2 * matrix[0][i];
        }

        return sum;
    }
}