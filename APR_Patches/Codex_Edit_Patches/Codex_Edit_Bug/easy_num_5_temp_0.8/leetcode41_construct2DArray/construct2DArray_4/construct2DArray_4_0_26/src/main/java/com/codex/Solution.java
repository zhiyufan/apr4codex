package com.codex;

import java.util.*;

public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        
        int[][] arr = new int[m][n];
        int k = 0; // Index of original array

        for (int i = 0; i < m; i++) {
            
            if (i % 2 == 0) {
                // Even row
                for (int j = 0; j < n; j++) {
                    if (k < original.length) {
                        arr[i][j] = original[k];
                        k += 1;
                    }
                }
            } else {
                // Odd row
                for (int j = n - 1; j >= 0; j--) {
                    if (k < original.length) {
                        arr[i][j] = original[k];
                        k += 1;
                    }
                }

            }
        }
        return arr;
    }

    
}