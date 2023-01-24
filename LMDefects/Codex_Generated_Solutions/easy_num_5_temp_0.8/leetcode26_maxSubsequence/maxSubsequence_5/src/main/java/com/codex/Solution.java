package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        /** You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
         * Return any such subsequence as an integer array of length k.
         * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
         */
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[k];
        dp[0] = nums[0];
        for (int i = 1; i < k; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i]);
        }
        for (int i = k; i < n; i++) {
            if (nums[i] > dp[k - 1]) {
                dp[0] = dp[1];
                for (int j = 1; j < k - 1; j++) {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }

    }