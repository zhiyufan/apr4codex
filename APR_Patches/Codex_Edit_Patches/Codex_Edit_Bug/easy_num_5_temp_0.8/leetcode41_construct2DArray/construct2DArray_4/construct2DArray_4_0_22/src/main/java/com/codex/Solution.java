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

    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]
}