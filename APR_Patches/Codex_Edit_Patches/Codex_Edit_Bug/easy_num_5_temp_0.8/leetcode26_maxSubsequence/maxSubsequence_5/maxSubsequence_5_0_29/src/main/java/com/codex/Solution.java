package com.codex;

import java.util.*;

public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: An integer denote to find k non-overlapping subarrays
     * @return: An integer denote the sum of max k non-overlapping subarrays
     */
    public static int[] maxSubsequence(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int n = nums.length;
        if (k <= 0 || k > n) {
            return new int[]{};
        }
        if (k == n) {
            return nums;
        }
        int[] dp = new int[k + 1];
        int[] sum = new int[n + 1];
        sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int i = 1; i <= k; i++) {
            dp[i] = sum[i];
        }
        for (int i = 2; i <= k; i++) {
            for (int j = i; j <= n; j++) {
                dp[i] = Math.max(dp[i], dp[i - 1] + sum[j] - sum[j - i]);
            }
        }
        /*
        for (int i = 1; i <= k; i++) {
            dp[i] = sum[i];
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + sum[i] - sum[j]);
            }
        }
        */
        /*
        for (int i = k; i <= n; i++) {
            if (nums[i - 1] > dp[k - 1]) {
                dp[0] = nums[i - 1];
                for (int j = 1; j < k - 1; j++) {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
                dp[k - 1] = nums[i - 1];
            }
        }
        */
        return dp;
    }
    

    
}