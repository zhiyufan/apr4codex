package com.codex;

import java.util.*;

public class Solution {
// Construct 2D array from 1D array

// This program converts a 1D array into 2D array

    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] arr = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (k <= original.length) {
                    arr[i][j] = original[k];
                    k += 1;
                }
            }
        }
        return arr;
    }
}