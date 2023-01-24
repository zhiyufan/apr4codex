package com.codex;

import java.util.*;

public class Solution {
  public static int numberOfArrays(int[] differences, int lower, int upper) {

        int mod = 1000000007;
        int len = differences.length;
        int[] dp = new int[len + 1];
        dp[0] = 1;

        for (int i = 1; i < len + 1; i++) {
            if (differences[i - 1] == 0) { // same, will use the last one
                dp[i] = dp[i - 1] * (upper - lower + 1) % mod;
            } else if (differences[i - 1] > 0) { // will use the larger one
                for (int j = lower; j <= upper; j++) {
                    if (j <= differences[i - 1]) {
                        dp[i] = (dp[i] + dp[i - 1]) % mod;
                    } else if (j == differences[i - 1] + 1) {
                        dp[i] = (dp[i] + dp[i - 1] * (j - 1)) % mod;
                    } else {
                        dp[i] = (dp[i] + dp[i - 1] * (j - 1 - lower)) % mod;
                    }
                }
            } else { // will use the smaller one
                for (int j = lower; j <= upper; j++) {
                    if (j >= differences[i - 1]) {
                        dp[i] = (dp[i] + dp[i - 1]) % mod;
                    } else if (j == differences[i - 1] - 1) {
                        dp[i] = (dp[i] + dp[i - 1] * (upper - j)) % mod;
                    } else {
                        dp[i] = (dp[i] + dp[i - 1] * (upper - j - lower)) % mod;
                    }
                }
            }
        }
        return (int) dp[differences.length][1];
    }

    
}