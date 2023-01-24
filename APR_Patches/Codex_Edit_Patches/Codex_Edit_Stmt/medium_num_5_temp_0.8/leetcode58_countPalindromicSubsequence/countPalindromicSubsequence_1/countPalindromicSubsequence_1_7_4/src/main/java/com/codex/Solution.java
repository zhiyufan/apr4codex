package com.codex;

import java.util.*;

public class Solution {
//Memoization
    public static int countPalindromicSubsequence(String s) {
        return countPalindromicSubsequenceMemo(s, 0, s.length() - 1, new int[s.length()][s.length()]);
    }

    public static int countPalindromicSubsequenceMemo(String s, int i, int j, int[][] memo) {
        if (i == j) {
            return 1;
        } else if (i == j - 1) {
            return 1 + (s.charAt(i) == s.charAt(j) ? 1 : 0);
        } else if (memo[i][j] != 0) {
            return memo[i][j];
        } else {
            int count = 0;
            if (s.charAt(i) == s.charAt(j)) {
                count += 1 + countPalindromicSubsequenceMemo(s, i + 1, j - 1, memo);
            }
            count += countPalindromicSubsequenceMemo(s, i + 1, j, memo);
            count += countPalindromicSubsequenceMemo(s, i, j - 1, memo);
            count -= countPalindromicSubsequenceMemo(s, i + 1, j - 1, memo);
            memo[i][j] = count;
            return memo[i][j];
        }
    }



//Bottom-up dynamic programming
    public static int countPalindromicSubsequence(String s) {
        

        int[][] dp = new int[s.length()][s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }

        return dp[0][s.length()-1];
    }
}