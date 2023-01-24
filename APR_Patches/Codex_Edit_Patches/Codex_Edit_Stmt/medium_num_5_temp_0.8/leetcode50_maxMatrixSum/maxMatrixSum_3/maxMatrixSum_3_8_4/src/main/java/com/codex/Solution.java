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

    public static boolean isMatch(String s, String p) {
        
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i=1; i<p.length() && p.charAt(i) == '*'; i++) {
            dp[0][i+1] = true;
        }
        for (int i=0; i<s.length(); i++) {
            for (int j=0; j<p.length(); j++) {
                switch (p.charAt(j)) {
                    case '?':
                        dp[i+1][j+1] = dp[i][j];
                        break;
                    case '*':
                        for (int k=i; k>=0; k--) {
                            if (dp[k][j]) {
                                for (int l=k; l<=i; l++) {
                                    dp[l+1][j+1] = true;
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        dp[i+1][j+1] = dp[i][j] && (s.charAt(i) == p.charAt(j));
                        break;
                }
            }
        }
        return dp[s.length()][p.length()];
    }



        return dp[matrix.length-1][matrix[0].length-1];
    }

    
}