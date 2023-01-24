package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors == null || colors.length() == 0) {
            return false;
        }
        if (colors.length() == 1) {
            return true;
        }
        int n = colors.length();
        int[][] dp = new int[2][n];
        dp[0][0] = colors.charAt(0) == 'A' ? 0 : 1;
        for (int i = 1; i <= n - 1; i++) {
            int cur = i % 2, pre = (i - 1) % 2;
            dp[cur][0] = dp[cur][i - 1] + (colors.charAt(i - 1) == 'B' ? 1 : 0);
            for (int j = 1; j <= n - 1; j++) {
                dp[cur][j] = Math.min(
                        dp[pre][j - 1] + (colors.charAt(j - 1) == 'B' ? 1 : 0), // not take
                        dp[cur][j - 1] + (colors.charAt(j - 1) == 'A' ? 1 : 0) // take
                );
            }
        }
        return dp[(n - 1) % 2][n - 1] <= dp[(n - 2) % 2][n - 2];
    }

    
}