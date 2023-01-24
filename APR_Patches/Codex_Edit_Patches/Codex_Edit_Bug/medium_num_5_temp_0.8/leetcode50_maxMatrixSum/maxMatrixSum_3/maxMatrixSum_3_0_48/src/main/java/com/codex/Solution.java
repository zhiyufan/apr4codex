package com.codex;

import java.util.*;

public class Solution {
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
        for (int[] a: dp)
            System.out.println(Arrays.toString(a));
        return maxPath(dp);
    }

    public static long maxPath(int[][] dp) {
        int i = dp.length-1;
        int j = dp[0].length-1;
        long sum = dp[i][j];
        while (i > 0 && j > 0) {
            if (dp[i-1][j] > dp[i][j-1]) {
                i--;
            } else {
                j--;
            }
            sum += dp[i][j];
        }
        while (i > 0) {
            i--;
            sum += dp[i][j];
        }
        while (j > 0) {
            j--;
            sum += dp[i][j];
        }
        return sum;
    }
}