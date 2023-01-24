package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {

    public static long maximumSubsequenceCount(String text, String pattern) {
        
        if (text.length() < pattern.length()) return 0;

        int[][] dp = new int[text.length() + 1][pattern.length() + 1];
        for (int i = 1; i <= text.length(); i++) {
            for (int j = 1; j <= pattern.length(); j++) {
                dp[i][j] = dp[i - 1][j];
                if (text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j - 1]);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i <= text.length(); i++) {
            ans = Math.max(ans, dp[i][pattern.length()]);
        }
        return ans;
    }
}