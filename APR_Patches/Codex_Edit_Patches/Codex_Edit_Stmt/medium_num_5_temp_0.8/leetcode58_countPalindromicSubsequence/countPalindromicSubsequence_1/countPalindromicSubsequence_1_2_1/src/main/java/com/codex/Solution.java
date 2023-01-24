package com.codex;

import java.util.*;

public class Solution {
  public static int countPalindromicSubsequence(String s) {

        int[][] dp = new int[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    int one = i + 1;
                    int two = j + i - 1;
                    dp[i][j] = dp[one][two - 1] + dp[one + 1][two] + 1;
                } else {
                    int one = i;
                    int two = j + i;
                    dp[i][j] = dp[one + 1][two] + dp[one][two - 1] - dp[one + 1][two - 1];
                }
            }
        }

        return dp[0][s.length()-1];
    }

    
}