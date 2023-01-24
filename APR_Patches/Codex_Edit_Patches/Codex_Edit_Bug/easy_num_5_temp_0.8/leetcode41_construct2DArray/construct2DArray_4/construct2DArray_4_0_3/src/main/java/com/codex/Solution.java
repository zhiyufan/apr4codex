package com.codex;

import java.util.*;

public class Solution {
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


    public static int[] flat2DArray(int[][] original) {
        
        if (original == null) {
            return null;
        }

        int rows = original.length;
        if (rows == 0) {
            return new int[0];
        }
        int columns = original[0].length;

        int[] arr = new int[rows * columns];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[k] = original[i][j];
                k += 1;
            }
        }
        return arr;
    }

    
    
}