package com.codex;

import java.util.*;

public class Solution {
public static int numberOfArrays(int[] differences, int lower, int upper) {
        int mod = 1000000007;
        long[] dp = new long[differences.length + 1];
        dp[0] = 1;
        for (int i = 0; i < differences.length; i++) {
            dp[i + 1] = 0;
            for (int j = lower; j <= upper; j++) {
                if (i - j >= 0 && differences[i - j] == i - j - 1) {
                    dp[i + 1] = (dp[i + 1] + dp[i - j]) % mod;
                }
            }
        }
        return (int) dp[differences.length][1];
    }

    
}