package com.codex;

import java.util.*;

public class Solution {
    public static int countVowelSubstrings(String word) {
        int n = word.length();
        int[][] dp = new int[n + 1][5];
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            int cur = word.charAt(i) - 'a';
            for (int j = 0; j < 5; j++) {
                dp[i][j] = dp[i + 1][j];
            }
            dp[i][cur]++;
            for (int j = 0; j < 5; j++) {
                ans += dp[i][j];
            }
        }
    }
}