package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        /** You are given a 0-indexed array nums consisting of n positive integers.
         * The array nums is called alternating if:
         * nums[i - 2] == nums[i], where 2 <= i <= n - 1.
         * nums[i - 1] != nums[i], where 1 <= i <= n - 1.
         * In one operation, you can choose an index i and change nums[i] into any positive integer.
         * Return the minimum number of operations required to make the array alternating.
         */
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
            }
            if (i + 2 < n) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i]));
            }
        }
        return dp[n - 1];
    }

    }