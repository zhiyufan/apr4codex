package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {

        int height = matrix.length;
        int width = matrix[0].length;

        long[][] sum = new long[height][width];

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                sum[row][col] = matrix[row][col];
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i > 0 && j > 0) {
                    sum[i][j] += Math.max(sum[i - 1][j], sum[i][j - 1]);
                } else if (i > 0) {
                    sum[i][j] += sum[i - 1][j];
                } else if (j > 0) {
                    sum[i][j] += sum[i][j - 1];
                }
            }
        }
        return sums[n - 1][n - 1];
    }

    
}