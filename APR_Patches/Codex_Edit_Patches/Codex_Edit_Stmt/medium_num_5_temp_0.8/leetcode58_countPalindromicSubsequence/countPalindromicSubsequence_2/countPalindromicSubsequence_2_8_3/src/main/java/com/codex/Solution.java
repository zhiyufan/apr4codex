package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int countPalindromicSubsequences(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i ++) dp[i][i] = 1;
        for(int step = 1; step < len; step ++) {
            for(int i = 0; i + step < len; i ++) {
                int j = i + step;
                if(s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i + 1][j - 1] * 2 + 2;
                else dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
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
    
}