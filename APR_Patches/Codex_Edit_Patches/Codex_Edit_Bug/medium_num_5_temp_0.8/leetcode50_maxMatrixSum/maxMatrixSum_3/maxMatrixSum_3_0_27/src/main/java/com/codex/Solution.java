package com.codex;

import java.util.*;

public class Solution {
// Maximum sum path

    public static long maxMatrixSum(int[][] matrix) {
        

        int[][] dp = new int[matrix.length][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for (int i=1; i<matrix[0].length; i++) {
            dp[0][i] = dp[0][i-1] + matrix[0][i];
        }
        for (int i=1; i<matrix.length; i++) {
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + matrix[i][j];
            }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }

    // Path to reach the end of n*m matrix
    public int numberOfPaths(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        dp[0][0] = 1;
        for (int i=1; i<arr[0].length; i++) {
            dp[0][i] = dp[0][i-1];
        }
        for (int i=1; i<arr.length; i++) {
            dp[i][0] = dp[i-1][0];
        }
        for (int i=1; i<arr.length; i++) {
            for (int j=1; j<arr[0].length; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[arr.length-1][arr[0].length-1];
    }
}