package com.codex;

import java.util.*;

public class Solution {
 public static String getLongestPalindromicSubstring(String s) {
        int[][] dp = new int[s.length()][s.length()];

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if (i == j) {
                    dp[i][j] = 0;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                } else {
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}