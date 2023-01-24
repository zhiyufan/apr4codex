package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(String leaves) {
        char[] str = leaves.toCharArray();
        int[][] dp = new int[str.length][3];
        dp[0][0] = str[0] == 'y' ? 1 : 0; 
        dp[0][1] = dp[0][2] = dp[1][2] = Integer.MAX_VALUE;
        for (int i = 1; i < str.length; i++) {
            dp[i][0] = dp[i - 1][0] + (str[i] == 'y' ? 1 : 0);
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + (str[i] == 'r' ? 1 : 0);
            if (i >= 2) {
                dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][2]) + (str[i] == 'y' ? 1 : 0);
            }
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    
}