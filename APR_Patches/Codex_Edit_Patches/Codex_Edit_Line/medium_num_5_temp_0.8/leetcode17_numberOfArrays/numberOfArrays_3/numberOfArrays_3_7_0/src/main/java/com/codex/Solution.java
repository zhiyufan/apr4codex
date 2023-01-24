package com.codex;

import java.util.*;

public class Solution {
// method 1    
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        long mod = 1000000007;
        long[][] dp = new long[differences.length + 1][2];
        dp[0][0] = 1;
        dp[0][1] = 1;
        for (int i = 1; i < differences.length + 1; i++) {
            if (differences[i - 1] == 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * (upper - lower + 1) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower + 1) % mod) % mod;
            } else if (differences[i - 1] > 0) {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * lower % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * upper % mod) % mod;
            } else {
                dp[i][0] = (dp[i][0] + dp[i - 1][0] * upper % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][1] * (upper - lower) % mod) % mod;
                dp[i][1] = (dp[i][1] + dp[i - 1][0] * lower % mod) % mod;
            }
        }
        return (int) dp[differences.length][1];

// method 2
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int mod = 1000000007;
        int[] dp = new int[differences.length + 1];
        dp[0] = 1;
        for (int i = 1; i < differences.length + 1; i++) {
            for (int j = lower; j <= upper; j++) {
                if (differences[i - 1] == 0) {
                    dp[i] = (dp[i] + dp[i - 1]) % mod;
                } else if (differences[i - 1] > j) {
                    break;
                } else if (differences[i - 1] <= j) {
                    dp[i] = (dp[i] + dp[i - 1]) % mod;
                }
            }
        }
        return dp[differences.length];
    }
    }

    
}