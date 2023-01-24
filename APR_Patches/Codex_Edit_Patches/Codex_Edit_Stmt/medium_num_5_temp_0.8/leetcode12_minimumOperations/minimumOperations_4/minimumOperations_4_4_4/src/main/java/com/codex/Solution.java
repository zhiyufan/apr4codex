package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(String leaves) {
        
        char[] cha = leaves.toCharArray();
        int n = cha.length;
        int[][] dp = new int[n][3];
        dp[0][0] = (cha[0] == 'y') ? 1 : 0;
        dp[0][1] = dp[0][2] = dp[1][2] = Integer.MAX_VALUE;
        for (int i = 1;i < n;i++) {
            int isRed = (cha[i] == 'r') ? 1 : 0;
            int isYellow = (cha[i] == 'y') ? 1 : 0;
            dp[i][0] = dp[i - 1][0] + isYellow;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + isRed;
            if (i >= 2) dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][2]) + isYellow;
        }
        return dp[n - 1][2];
    }

    
}