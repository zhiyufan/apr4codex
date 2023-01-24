package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) dp[i][i] = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) dp[i - 1][i] = 3;
            else dp[i - 1][i] = 2;
        }
        for (int p = 2; p < len; p++) {
            for (int i = 0; i < len - p; i++) {
                int j = p + i;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 1 + 2 * dp[i + 1][j - 1];
                }
                
                for (int k = i + 1; k < j; k++) {
                    int l = dp[i][k] + dp[k + 1][j];
                    if (l > dp[i][j]) dp[i][j] = l;
                }
            }
        }
        return dp[0][len - 1];
    }

    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("cabcb"));
    }
}
}