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
        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = 1;
        dp[1][0] = dp[1][1] = 1;
        for (int i = 2; i < len; i++) {
            dp[i][0] = dp[i-1][1];
            if (nums[i] != nums[i-1]) {
                dp[i][0] += 1;
            }
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][1]);
            if (nums[i] != nums[i-1]) {
                dp[i][1] += 1;
            }
        }
        return Math.min(dp[len-1][0], dp[len-1][1]);
    }

    }