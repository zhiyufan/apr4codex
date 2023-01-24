package com.codex;

import java.util.*;

public class Solution {
package interviewbit;
//Recursion:
//sum(r, c) = elements[r][c] + sum(r+1, c) + sum(r, c+1)
//base case sum(r, c) = 0 if r==m || if c==n

public class MatrixSum {
    public static int maxMatrixSum(int[][] matrix) {
        

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

    public static void main(String args[]) {
        int[][] matrix = {{9,1,0}, {6,7,2}, {7,3,2}};
        System.out.println(maxMatrixSum(matrix));
    }
        }
        return dp[matrix.length-1][matrix[0].length-1];
    }

    
}