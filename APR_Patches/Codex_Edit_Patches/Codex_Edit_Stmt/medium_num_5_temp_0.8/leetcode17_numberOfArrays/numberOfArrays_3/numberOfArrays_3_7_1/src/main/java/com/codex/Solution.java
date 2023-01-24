package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        long mod = 1000000007;
        long[][] dp = new long[differences.length + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < differences.length + 1; i++) {
            if (differences[i - 1] == 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * (upper - lower + 1)) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower + 1)) % mod;
            } else if (differences[i - 1] > 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * lower) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * (upper - lower)) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * upper) % mod;
            } else {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * upper) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower)) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * lower) % mod;
            }
        }
        return (int) dp[differences.length][1];
    }

    
}