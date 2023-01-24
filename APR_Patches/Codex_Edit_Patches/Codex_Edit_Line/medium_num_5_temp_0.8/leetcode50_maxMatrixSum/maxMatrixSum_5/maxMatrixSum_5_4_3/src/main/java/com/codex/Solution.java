package com.codex;

import java.util.*;

public class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] matrixSum = new int[rows][cols];

        matrixSum[0][0] = matrix[0][0];

        for(int i=1;i<rows;i++) {
            matrixSum[i][0] = matrixSum[i-1][0] + matrix[i][0];
        }

        for(int j=1;j<cols;j++) {
            matrixSum[0][j] = matrixSum[0][j-1] + matrix[0][j];
        }

        for(int i=1;i<rows;i++) {
            for(int j=1;j<cols;j++) {
                matrixSum[i][j] = matrix[i][j] + Math.max(matrixSum[i-1][j],matrixSum[i][j-1]);
            }
        }

        long maxSum = Long.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(maxSum<matrixSum[i][j]) {
                    maxSum = matrixSum[i][j];
                }
            }











    
    static int M = 1000000007;
    static int numberOfWays(int n, int m){
        
        // Write your code here
        if(n == 1)
            return m;
        if(m == 1)
            return 1;
        int[][] dp = new int[m][n+1];
        for(int i =0;i<m;i++) {
            for(int j=0;j<=n;j++) {
                dp[i][j] = -1;
            }
        }
        int sum = 0;
        for(int i =1;i<=m;i++) {
            sum += solve(i,n-1,m,dp);
            sum %= M;
        }
        return sum;
    }
    static int solve(int curr, int moves, int m, int[][] dp) {
        if(moves == 0)  
            return 1;
        if(curr < 1 || curr > m)
            return 0;
        if(dp[curr-1][moves] > -1)
            return dp[curr-1][moves];
        int sum = 0;
        if(moves == 1) {
            sum = m;
            dp[curr-1][moves] = sum;
            return sum;
        }
        for(int i = 1;i<=m;i++) {
            sum += solve(i,moves-1,m,dp);
            sum %= M;
        }
        dp[curr-1][moves] = sum;
        return sum;
    }
        }

        return maxSum;
    }
}