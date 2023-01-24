package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        
        int mod = 1000000007;
        int n = differences.length;
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

int maxProduct(int[] nums) {
    int n = nums.length;
    int[] max = new int[n];
    int[] min = new int[n];
    max[0] = nums[0];
    min[0] = nums[0];
    int result = nums[0];
    for (int i = 1; i < n; i++) {
        max[i] = Math.max(nums[i], Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]));
        min[i] = Math.min(nums[i], Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]));
        result = Math.max(result, Math.max(max[i], min[i]));
    }
    return result;
}

    
}