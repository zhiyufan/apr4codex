package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {  
        long[][] dp = new long[matrix.length][matrix[0].length];
        dp[0][0] = (long)matrix[0][0];
        for (int j=1; j<matrix[0].length; j++) {
            dp[0][j] = dp[0][j-1] + matrix[0][j];
        }
        for (int i=1; i<matrix.length; i++) {
            dp[i][0] = dp[i-1][0] + (long)matrix[i][0];
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + (long)matrix[i][j];
            }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }

    
}