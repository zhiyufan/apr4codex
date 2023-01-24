package com.codex;

import java.util.*;

public class Solution {
//another solution
public class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (s.charAt(j) == s.charAt(j + i) && (i <= 1 || dp[j + 1][j + i - 1])) {
                    dp[j][j + i] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[j][i]) count++;
            }
        }
        return count;
    }
}

//
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
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                ans += dp[i][j];
            }
        }
        return ans;
    }
    
}