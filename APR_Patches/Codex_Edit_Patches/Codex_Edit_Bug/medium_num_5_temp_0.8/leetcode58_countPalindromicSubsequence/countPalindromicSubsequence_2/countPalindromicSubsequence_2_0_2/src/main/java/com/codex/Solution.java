package com.codex;

import java.util.*;

public class Solution {
# Count Palindromic Subsequence

    public static int countPalindromicSubsequence(String s) {
        
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            if (i != s.length() - 1) {
                if (s.charAt(i) == s.charAt(i + 1)) dp[i][i + 1] = 3;
                else dp[i][i + 1] = 2;
            }
        }
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i < s.length() - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i][j] + 1 + dp[i + 1][j - 1];
                    if (len == 3) dp[i][j] = dp[i][j] - 1;
                }
            }
        }
        return dp[0][s.length() - 1];
    }
    
# Count Palindromic Substrings

    public static int countPalindromicSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res++;
            int l = i - 1, r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                res++;
                l--;
                r++;
            }
        }
        return res;
    }
    
}