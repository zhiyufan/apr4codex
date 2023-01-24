package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {

        int n = colors.length();
        int[][] dp = new int[2][n];
        dp[0][n - 1] = colors.charAt(n - 1) == 'A' ? 0 : 1;
        dp[1][n - 1] = colors.charAt(n - 1) == 'B' ? 0 : 1;
        for (int i = n - 2; i >= 0; i--) {
            int cur = i % 2, pre = (i + 1) % 2;
            dp[cur][i] = dp[pre][i + 1] + (colors.charAt(i) == 'A' ? 0 : 1);
            for (int j = i + 1; j < n; j++) {
                dp[cur][j] = Math.min(
                        dp[cur][j - 1] + (colors.charAt(j) == 'B' ? 0 : 1),
                        dp[pre][j] + (colors.charAt(j) == 'A' ? 0 : 1)
                );
            }
        }
        
        return dp[0][n - 1] <= dp[1][n - 1];
    }
}