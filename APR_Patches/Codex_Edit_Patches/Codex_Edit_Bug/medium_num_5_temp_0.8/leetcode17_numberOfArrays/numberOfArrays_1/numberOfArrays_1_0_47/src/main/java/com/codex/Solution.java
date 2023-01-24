package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length, prefix = 0;
        long[] dp = new long[n + 1], cnt = new long[200001];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            prefix = (prefix + differences[i]) % mod;
            for (int j = 0; j < 2; j++) {
                int cur = prefix - lower + 400000 - j;
                dp[i + 1] = (dp[i + 1] + dp[cur] * cnt[cur]) % mod;
            }
            cnt[prefix - lower + 400000]++;
        }
        return (int)dp[n];
    }

    
}