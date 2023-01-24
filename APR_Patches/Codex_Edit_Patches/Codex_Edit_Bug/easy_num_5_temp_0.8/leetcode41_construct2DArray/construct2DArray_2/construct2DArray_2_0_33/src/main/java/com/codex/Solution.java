package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i * n + j < original.length) {
                    result[i][j] = original[i * n + j];
                }
            }
        }
        return result;
    }





    public int searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            
            int pivot = (left + right) / 2;
            int pivotElement = matrix[pivot / n][pivot % n];
            
            if (target == pivotElement) {
                return pivot;
            }
            else {
                if (target < pivotElement) {
                    right = pivot - 1;
                }
                else {
                    left = pivot + 1;
                }
            }
        }
        return -1;
    }
    
}