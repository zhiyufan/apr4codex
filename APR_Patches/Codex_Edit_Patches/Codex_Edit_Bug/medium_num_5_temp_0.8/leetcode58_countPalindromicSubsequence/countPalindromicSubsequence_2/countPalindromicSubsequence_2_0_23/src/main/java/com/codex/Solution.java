package com.codex;

import java.util.*;

public class Solution {
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
    
    def check(self, s, left, right):
        while left >= 0 and right <= len(s) - 1:
            if s[left] != s[right]: return False
            left -= 1
            right += 1
        return True
    
    
    def countSubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        for i in range(len(s)):
            count += 1
            left, right = i - 1, i + 1
            while left >= 0 and right <= len(s) - 1:
                if s[left] == s[right]: count += 1
                else: break
                left -= 1
                right += 1
            left, right = i, i + 1
            while left >= 0 and right <= len(s) - 1:
                if s[left] == s[right]: count += 1
                else: break
                left -= 1
                right += 1
        return count
    
}