package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        
        int n = matrix.length;
        int[][] sums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sums[i][j] = Math.max(sums[i][j - 1], sums[i - 1][j]);
            }
        }

        return sums[n - 1][n - 1];
    }

    
}