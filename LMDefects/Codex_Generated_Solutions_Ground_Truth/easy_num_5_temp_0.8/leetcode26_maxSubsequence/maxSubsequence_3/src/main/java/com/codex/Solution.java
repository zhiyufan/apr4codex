package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        /** You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
         * Return any such subsequence as an integer array of length k.
         * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
         */
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = k - 1; i < nums.length; i++) {
            int sum = dp[i];
            if (i - k >= 0) {
                sum = sum - dp[i - k];
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, end - k + 1, end + 1);
    }

    }