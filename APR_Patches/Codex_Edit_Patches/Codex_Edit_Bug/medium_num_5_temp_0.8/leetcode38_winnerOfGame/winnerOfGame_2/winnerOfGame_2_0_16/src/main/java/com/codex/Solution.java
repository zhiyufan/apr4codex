package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        int n = s.length();
        char[] sc = s.toCharArray();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][i] = sc[i - 1] == 'A' ? 1 : 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (i == j || i + 1 == j) {
                    dp[i][j] = sc[j - 1] == 'A' ? 1 : 0;
                } else {
                    dp[i][j] = dp[i][j - 1] + (sc[j - 1] == 'A' ? 1 : 0);
                }
            }
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++) {
                dp[i][j] = Math.min(dp[i + 1][j] + (sc[i - 1] == 'B' ? 1 : 0), dp[i][j - 1] + (sc[j - 1] == 'B' ? 1 : 0));
            }
        }
        return dp[1][n] <= n / 2;
    }

    // slow
    public static boolean winnerOfGameSlow(String colors) {
        
        if (colors == null || colors.length() == 0) {
            return false;
        }
        if (colors.length() == 1) {
            return true;
        }
        int n = colors.length();
        int[][] dp = new int[2][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + (colors.charAt(i - 1) == 'B' ? 1 : 0);
        }
        for (int i = 1; i <= n - 1; i++) {
            int cur = i % 2, pre = (i - 1) % 2;
            dp[cur][i] = dp[pre][i] + (colors.charAt(i - 1) == 'A' ? 1 : 0);
            for (int j = i + 1; j <= n; j++) {
                dp[cur][j] = Math.min(
                        dp[pre][j - 1] + (colors.charAt(j - 1) == 'B' ? 1 : 0),
                        dp[pre][j] + (colors.charAt(j - 1) == 'A' ? 1 : 0)
                );
            }
        }
        int cur = (n - 1) % 2, pre = (n - 2) % 2;
        return dp[cur][n] <= dp[pre][n - 1];
    }
}