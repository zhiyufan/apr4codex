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

    


        int[][] dp = new int[s.length()+1][s.length()+1];

        char[] sa = s.toCharArray();
        int[][] pal = new int[sa.length][sa.length];
        for (int i = 0; i < sa.length; i++) {
            pal[i][i] = 1;
        }
        
        int max = 0;
        for (int len = 2; len <= sa.length; len++) {
            for (int i = 0; i <= sa.length - len; i++) {
                int j = i + len - 1;
                if (sa[i] == sa[j]) {
                    pal[i][j] = 2 + pal[i+1][j-1];
                } else {
                    pal[i][j] = Math.max(pal[i+1][j], pal[i][j-1]);
                }
            }
        }
        
        for (int k = 0; k <= s.length(); k++) {
            for (int i = 0; i < s.length() - k; i++) {
                int j = i + k;
                if (k == 0) {
                    dp[i][j] = 1;
                } else if (i == j) {
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
}