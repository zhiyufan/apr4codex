package com.codex;

import java.util.*;

public class Solution {
public static long maxMatrixSum(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] dp = new int[rows][cols];
    dp[0][0] = matrix[0][0];
    for (int i=1; i<cols; i++) {
        dp[0][i] = dp[0][i-1] + matrix[0][i];
    }

    for (int i=1; i<rows; i++) {
        dp[i][0] = dp[i-1][0] + matrix[i][0];
    }
    for (int i=1; i<rows; i++) {
        for (int j=1; j<cols; j++) {
            dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + matrix[i][j];
        }
    }
    return dp[rows-1][cols-1];
}
}