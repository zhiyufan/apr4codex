package com.codex;

import java.util.*;

public class Solution {
    // the bug is that we need to check the sum of dp[i-1][j] and matrix[i][j], and the sum of dp[i][j-1] and matrix[i][j]
    // We can not use the dp[i][j-1] and dp[i-1][j] directly

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
                dp[i][j] = Math.max(dp[i-1][j] + matrix[i][j], dp[i][j-1] + matrix[i][j]);
            }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }

    
}