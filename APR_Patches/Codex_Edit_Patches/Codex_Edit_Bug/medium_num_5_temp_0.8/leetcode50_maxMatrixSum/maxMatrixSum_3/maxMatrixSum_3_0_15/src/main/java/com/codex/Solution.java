package com.codex;

import java.util.*;

public class Solution {
    public static int maxMatrixSum(int[][] matrix) {
        

        int[][] dp = new int[2][matrix[0].length];
        dp[0][0] = matrix[0][0];
        for (int i=1; i<matrix[0].length; i++) {
            dp[0][i] = dp[0][i-1] + matrix[0][i];
        }
        	dp[i%2][0] = dp[(i-1)%2][0] + matrix[i][0];
        
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                dp[i%2][j] = Math.max(dp[(i-1)%2][j], dp[i%2][j-1]) + matrix[i][j];
            }
        }
        return dp[(matrix.length-1)%2][matrix[0].length-1];
    }

    
}