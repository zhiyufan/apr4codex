package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j) && j - i == 1) {
                    dp[i][j] = 2;
                } else if (s.charAt(i) == s.charAt(j)) { // All other cases, except where s[i] == s[j]
                    // eg. (b a b a c)
                    //     [0 1 2 3 4]
                    //   i
                    //     j
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}