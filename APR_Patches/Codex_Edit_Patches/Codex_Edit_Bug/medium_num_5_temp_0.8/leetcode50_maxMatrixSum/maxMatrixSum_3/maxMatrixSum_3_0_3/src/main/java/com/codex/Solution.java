package com.codex;

import java.util.*;

public class Solution {



    public static long maxMatrixSum(int[][] matrix) {

        // dp is used to store the maximum sum till that cell

        // process the first row
        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for (int i=1; i<matrix[0].length; i++) {
        // process the first column
            dp[0][i] = dp[0][i-1] + matrix[0][i];
        }
        for (int i=1; i<matrix.length; i++) {
        // process rest of the matrix
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                dp[i][j] = matrix[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }
}