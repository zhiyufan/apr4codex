package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        


        int[][] maxSum = new int[matrix.length][matrix[0].length];
        maxSum[0][0] = matrix[0][0];
        for (int i=1; i<matrix[0].length; i++) {
            maxSum[0][i] = maxSum[0][i-1] + matrix[0][i];
        }
        for (int i=1; i<matrix.length; i++) {
            maxSum[i][0] = maxSum[i-1][0] + matrix[i][0];
        }
        for (int i=1; i<matrix.length; i++) {
            for (int j=1; j<matrix[0].length; j++) {
                maxSum[i][j] = Math.max(maxSum[i-1][j], maxSum[i][j-1]) + matrix[i][j];
            }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }

    
}