package com.codex;

import java.util.*;

public class Solution {
class file {
    
    static int minPathSum(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 0; j--) {
                
                if (i == n - 1 && j == m - 1) {
                    dp[i][j] = matrix[i][j];
                }
                else if (i == n - 1) {
                    dp[i][j] = dp[i][j + 1] + matrix[i][j];
                }
                else if (j == m - 1) {
                    dp[i][j] = dp[i + 1][j] + matrix[i][j];
                }
                else {
                    dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + matrix[i][j];
                }
            }
            
        }
        return dp[n - 1];
    }

    
}