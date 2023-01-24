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
        int dp[][] = new int[nums.length][3];
        for (int[] d : dp) Arrays.fill(d, Integer.MAX_VALUE);
        dp[0][1] = nums[0];
        dp[1][1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            if (nums[i - 2] == nums[i]){
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][1] + nums[i]);
                dp[i][2] = Math.min(dp[i][2], dp[i - 2][2] + nums[i]);
            } else {
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][1] + nums[i]);
                dp[i][1] = Math.min(dp[i][1], dp[i - 2][2] + nums[i]);
            }
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + nums[i - 1]);
            dp[i][1] = Math.min(dp[i][1], dp[i - 1][2] + nums[i -1]);
        }
        return Math.min(dp[nums.length - 1][1], dp[nums.length - 1][2]);
    }

    }