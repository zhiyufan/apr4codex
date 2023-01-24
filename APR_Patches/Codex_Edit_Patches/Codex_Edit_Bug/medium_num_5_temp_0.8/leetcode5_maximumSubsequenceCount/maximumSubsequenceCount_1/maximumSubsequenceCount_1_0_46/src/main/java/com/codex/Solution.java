package com.codex;

import java.util.*;

public class Solution {
    public String longestCommonSubsequence(String text1, String text2) {
        int text1Len = text1.length();
        int text2Len = text2.length();
        int[][] dp = new int[text1Len + 1][text2Len + 1];
        
        for (int i = 0; i <= text1Len; i++) {
            for (int j = 0; j <= text2Len; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text.length()][pattern.length()];
    }

    
}