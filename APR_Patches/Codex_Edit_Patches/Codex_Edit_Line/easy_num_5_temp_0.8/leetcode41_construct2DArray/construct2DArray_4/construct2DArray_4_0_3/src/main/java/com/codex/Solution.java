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

    public static int[][] transpose(int[][] original) {
        int[][] transposedArray = new int[original[0].length][original.length];
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[0].length; j++) {
                transposedArray[i][j] = original[j][i];
            }
        }
        return transposedArray;
    }
}