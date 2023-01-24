package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j-1] + (s.charAt(i) == s.charAt(j) ? dp[i+1][j-1] + 1 : 0);
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}