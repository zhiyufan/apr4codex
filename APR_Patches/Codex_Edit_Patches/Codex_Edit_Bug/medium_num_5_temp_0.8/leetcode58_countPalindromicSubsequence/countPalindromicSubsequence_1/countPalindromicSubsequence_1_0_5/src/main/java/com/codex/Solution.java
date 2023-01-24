package com.codex;

import java.util.*;

public class Solution {
    // Given a string, find the count of palindromic subsequences
    // dp[i][j] = 2+ dp[i+1][j-1] if s[i] == s[j]
    // otherwise dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
    // Time Complexity O(n^2)
    // Space Complexity O(n^2)

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

    
}