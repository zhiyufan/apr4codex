package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        /** You are given a 0-indexed string text and another 0-indexed string pattern of length 2, both of which consist of only lowercase English letters.
         * You can add either pattern[0] or pattern[1] anywhere in text exactly once. Note that the character can be added even at the beginning or at the end of text.
         * Return the maximum number of times pattern can occur as a subsequence of the modified text.
         * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
         */
        int[][] dp = new int[text.length() + 1][pattern.length() + 1];
        for (int i = 0; i < text.length(); i++) dp[i][0] = 1;
        for (int j = 1; j <= pattern.length(); j++) dp[0][j] = 0;
        for (int i = 1; i <= text.length(); i++) {
            for (int j = 1; j <= pattern.length(); j++) {
                dp[i][j] = dp[i - 1][j];
                if (text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j - 1]);
                }
            }
        }
        return dp[text.length()][pattern.length()];
    }

    }