package com.codex;

import java.util.*;

public class Solution {
public static boolean winnerOfGame(String colors) {
        
        if (colors == null || colors.length() <= 1) {
            return true;
        }
        int n = colors.length();
        int[][] dp = new int[2][n + 1];
        
        dp[0][0] = colors.charAt(0) == 'B' ? 1 : 0;
        dp[0][1] = colors.charAt(1) == 'B' ? 1 : 0;
        dp[0][1] += colors.charAt(0) == 'A' ? 1 : 0;
        dp[1][1] = colors.charAt(0) == 'A' ? 1 : 0;
        
        for (int i = 2; i < colors.length(); i++) {
            
            for (int j = 0; j < colors.length(); j++) {
                dp[i%2][j] = colors.charAt(i) == 'B' ? 1 : 0;
            }
            dp[i%2][0] += colors.charAt(i) == 'A' ? 1 : 0;
            for (int j = 1; j < colors.length(); j++) {
                int pre = (i - 1) % 2;
                dp[i%2][j] += Math.min(dp[pre][j-1], dp[pre][j]);
            }
            
        }
        return dp[(n-1)%2][n - 1] * 2 <= n;
    }
}