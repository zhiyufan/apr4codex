package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int countSubString(String S, int[] query) {
        int count = 0, n = S.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + (S.charAt(i - 1) == '0' ? 1 : 0);
            dp[i][0] = dp[i - 1][0] + (S.charAt(i - 1) == '1' ? 1 : 0);
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