package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    /**
     * @param original: the original array
     * @param rows: the rows of matrix
     * @param cols: the cols of matrix
     * @return: the modified array after rotation
     */
    public int[] matrixRotation(int[] original, int rows, int cols) {
        if (original.length % (rows * cols) != 0) {
            return original;
        }
        int[][] matrix = construct2DArray(original, rows, cols);
        int[] result = new int[original.length];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                result[k] = matrix[i][j];
                k += 1;
            }
        }
        return result;
    }

    // Constrct 2D array
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] arr = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k < original.length) {
                    arr[i][j] = original[k];
                    k += 1;
                }
            }
        }
        return arr;
    }

}
}