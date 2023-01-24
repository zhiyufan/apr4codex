package com.codex;

import java.util.*;

public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) dp[i] = nums[i];
            else dp[i] = dp[i - 1] + nums[i];
            if (dp[i] == k) {
                max = Math.max(max, i + 1);
            }
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