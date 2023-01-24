package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors == null || colors.isEmpty()) {
            return false;
        }
        int n = colors.length(), m = colors.length();
        int[][] dp = new int[2][m + 1];
        for (int i = 1; i <= n; i++) {
            dp[1][i] = dp[1][i - 1] + (colors.charAt(i - 1) == 'A' ? 1 : 0);
        }
        for (int i = 1; i <= m - 1; i++) {
            int pre = (i - 1) % 2, cur = i % 2;
            dp[cur][i] = dp[pre][i] + (colors.charAt(i - 1) == 'A' ? 1 : 0);
            for (int j = i + 1; j <= m; j++) {
                dp[cur][j] = Math.min(
                        dp[pre][j - 1] + (colors.charAt(j - 1) == 'B' ? 1 : 0),
                        dp[pre][j] + (colors.charAt(j - 1) == 'A' ? 1 : 0)
                );
            }
        }
        int cur = (m - 1) % 2, pre = (m - 2) % 2;
        return dp[cur][m] <= dp[pre][m - 1];
  }
  
  public static boolean winnerOfGame(String colors) {
        
        if (colors == null || colors.isEmpty()) {
            return false;
        }
        int n = colors.length(), m = colors.length();
        int[][] dp = new int[2][m + 1];
        for (int i = 1; i <= m; i++) {
            dp[0][i] = dp[0][i - 1] + (colors.charAt(i - 1) == 'B' ? 1 : 0);
        }
        for (int i = 1; i <= n; i++) {
            int cur = i % 2, pre = (i - 1) % 2;
            dp[cur][i] = dp[pre][i] + (colors.charAt(i - 1) == 'A' ? 1 : 0);
            for (int j = i + 1; j <= m; j++) {
                dp[cur][j] = Math.min(
                        dp[pre][j - 1] + (colors.charAt(j - 1) == 'B' ? 1 : 0),
                        dp[pre][j] + (colors.charAt(j - 1) == 'A' ? 1 : 0)
                );
            }
        }
        int cur = (m - 1) % 2, pre = (m - 2) % 2;
        return dp[cur][m] <= dp[pre][m - 1];
    }
}