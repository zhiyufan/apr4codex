package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][s.length()-1];
    }

    public static boolean isInterleave(String a, String b, String c) {
        
        if (c.length() != (a.length() + b.length())) {
            return false;
        }
        
        boolean[][] dp = new boolean[a.length() + 1][b.length() + 1];
        for (int i = 0; i < a.length() + 1; i++) {
            for (int j = 0; j < b.length() + 1; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j-1] & b.charAt(j-1) == c.charAt(i+j-1);
                } else if (j == 0) {
                    dp[i][j] = dp[i-1][j] & a.charAt(i-1) == c.charAt(i+j-1);
                } else {
                    dp[i][j] = (dp[i][j-1] & b.charAt(j-1) == c.charAt(i+j-1)) || 
                               (dp[i-1][j] & a.charAt(i-1) == c.charAt(i+j-1));
                }
            }
        }
        
        return dp[a.length()][b.length()];
    }
}