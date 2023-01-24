package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        /** Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
         * Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
         * A palindrome is a string that reads the same forwards and backwards.
         * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
         * For example, "ace" is a subsequence of "abcde".
         */

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