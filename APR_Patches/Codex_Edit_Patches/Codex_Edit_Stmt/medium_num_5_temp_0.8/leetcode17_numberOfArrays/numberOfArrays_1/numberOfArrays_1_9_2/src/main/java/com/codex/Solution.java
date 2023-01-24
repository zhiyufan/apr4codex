package com.codex;

import java.util.*;

public class Solution {
/*
    https://leetcode.com/problems/number-of-good-arrays/submissions/
*/
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
        long[] dp = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += differences[j];
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + (j == n - 1 ? 1 : dp[j + 1])) % mod;
                }
                if (sum > upper) break;
            }
        }
        return (int) (dp[0] % mod);
    }
}