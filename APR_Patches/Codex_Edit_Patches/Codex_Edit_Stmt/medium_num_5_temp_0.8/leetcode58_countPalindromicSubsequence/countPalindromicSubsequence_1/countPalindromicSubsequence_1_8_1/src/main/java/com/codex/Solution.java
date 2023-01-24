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

    public static int countPalindromicSubsequence_2(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }

        for (int startIndex = s.length() - 1; startIndex >= 0; startIndex--) {
            for (int endIndex = startIndex + 1; endIndex < s.length(); endIndex++) {
                if (s.charAt(startIndex) == s.charAt(endIndex)) {
                    dp[startIndex][endIndex] = dp[startIndex + 1][endIndex - 1] + 2;
                } else {
                    dp[startIndex][endIndex] = Math.max(dp[startIndex + 1][endIndex], dp[startIndex][endIndex - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}