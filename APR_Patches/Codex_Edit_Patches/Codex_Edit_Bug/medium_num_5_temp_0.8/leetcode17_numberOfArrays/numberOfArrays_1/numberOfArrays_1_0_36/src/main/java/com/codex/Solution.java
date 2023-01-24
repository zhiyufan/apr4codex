package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] nums, int lower, int upper) {
        
        int mod = (int)1e9 + 7;
        int n = nums.length;
        int[] differences = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0)
                differences[i] = nums[i] - nums[i - 1];
        }
        long[] dp = new long[n + 1];
        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += differences[j];   
                if (sum >= lower && sum <= upper) {
                    dp[i] = (dp[i] + dp[j + 1]) % mod;
                }
                if (sum > upper) break;
            }
        }
        return (int)dp[0];
    }

   
}