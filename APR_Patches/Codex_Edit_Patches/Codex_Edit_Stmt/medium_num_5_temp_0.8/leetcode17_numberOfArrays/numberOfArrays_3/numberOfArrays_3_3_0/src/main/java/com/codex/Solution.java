package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        long mod = 1000000007;
        long[][] dp = new long[differences.length + 1][2];
        dp[0][0] = lower;
        dp[0][1] = upper;
        for (int i = 1; i < differences.length + 1; i++) {
            if (differences[i - 1] == 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * (upper - lower + 1) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower + 1) % mod) % mod;
                
            } else if (differences[i - 1] > 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * lower % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * upper % mod) % mod;
            } else {
                dp[i][0] = (dp[i][0] + dp[i - 1][1] * lower % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * upper % mod) % mod;
            }
        }
        return (int) dp[differences.length][1];
    }

    
}