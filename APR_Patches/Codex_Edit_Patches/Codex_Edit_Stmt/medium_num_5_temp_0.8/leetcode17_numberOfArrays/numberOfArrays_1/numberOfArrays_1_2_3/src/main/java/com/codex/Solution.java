package com.codex;

import java.util.*;

public class Solution {
    // int mod = 1000000007;
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int n = differences.length;
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int current = differences[i];
            if (current >= lower && current <= upper) {
                dp[i] = (dp[i] + dp[i + 1] + 1) % mod;
            }
            if (current < lower) {
                dp[i] = (dp[i] + dp[i + 1]) % mod;
            }
            if (current > upper) {
                dp[i] = (dp[i] + 1) % mod;
            }
        }
        return dp[0];
    }




}