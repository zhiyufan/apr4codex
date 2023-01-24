package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int n = colors.length() - 1;
        int[][] dp = new int[2][n + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[0][i] = dp[0][i - 1] + (colors.charAt(i - 1) == 'B' ? 1 : 0);
        }
        for (int i = 1; i <= n; i++) {
            int cur = i % 2, pre = (i - 1) % 2;
            dp[cur][i] = dp[pre][i] + (colors.charAt(i - 1) == 'A' ? 1 : 0);
            for (int j = i + 1; j <= n; j++) {
                dp[cur][j] = Math.min(
                    dp[pre][j - 1] + (colors.charAt(j - 1) == 'B' ? 1 : 0),
                    dp[pre][j] + (colors.charAt(j - 1) == 'A' ? 1 : 0)
                );
            }
        }
        return dp[n % 2][n] <= dp[(n - 1) % 2][n - 1];
    }

    
}