package com.codex;

import java.util.*;

public class Solution {
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

    public static int[] linearize(int[][] A) {
        // Your code goes here.
        int m = A.length;
        int n = A[0].length;
        int[] arr = new int[m * n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[k] = A[i][j];
                k += 1;
            }
        }
        return arr;
    }
}
}