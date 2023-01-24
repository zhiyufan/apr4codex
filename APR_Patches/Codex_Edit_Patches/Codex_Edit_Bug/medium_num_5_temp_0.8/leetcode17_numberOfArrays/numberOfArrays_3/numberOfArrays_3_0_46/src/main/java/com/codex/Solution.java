package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        long mod = 1000000007;
        long[][] dp = new long[differences.length + 1][differences.length + 1];
        dp[0][0] = 1;
        for (int i = 1; i < differences.length + 1; i++) {
            if (differences[i - 1] == 0) {
                dp[i][0] = dp[i - 1][0] * (upper - lower + 1) % mod;
            } else if (differences[i - 1] > 0) {
                dp[i][differences[i - 1]] = dp[i - 1][0] * lower % mod;
                dp[i][differences[i - 1] + 1] = dp[i - 1][0] * (upper - lower) % mod;
                dp[i][differences[i - 1] + 1] = (dp[i][differences[i - 1] + 1] + dp[i - 1][differences[i - 1] + 1] * upper % mod) % mod;
            } else {
                dp[i][differences[i - 1]] = dp[i - 1][0] * upper % mod;
                dp[i][differences[i - 1] - 1] = dp[i - 1][differences[i - 1] - 1] * (upper - lower) % mod;
                dp[i][differences[i - 1] - 1] = (dp[i][differences[i - 1] - 1] + dp[i - 1][0] * lower % mod) % mod;
            }
        }
        long sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum = (sum + dp[differences.length][i]) % mod;
        }
        return (int) sum;
    }

    
}