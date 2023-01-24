package com.codex;

import java.util.*;

public class Solution {
    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i - j * j >= 0) {
                    dp[i] += dp[i - j * j];
                }
            }
        }
        return dp[n];
    }

    
}