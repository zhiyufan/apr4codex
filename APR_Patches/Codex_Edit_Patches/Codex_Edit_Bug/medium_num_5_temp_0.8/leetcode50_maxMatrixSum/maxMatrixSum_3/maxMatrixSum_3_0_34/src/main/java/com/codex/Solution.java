package com.codex;

import java.util.*;

public class Solution {
    #include<iostream>
    using namespace std;
    
    public static long maxMatrixSum(int[][] matrix) {
        long max_sum = Integer.MIN_VALUE;

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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (dp[i][j] > max_sum) {
                    max_sum = dp[i][j];
                }
            }
        }
        return max_sum;
    }

    int main() {
        int n;
        cin>>n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        cout<<maxMatrixSum(matrix)<<endl;
    }
}