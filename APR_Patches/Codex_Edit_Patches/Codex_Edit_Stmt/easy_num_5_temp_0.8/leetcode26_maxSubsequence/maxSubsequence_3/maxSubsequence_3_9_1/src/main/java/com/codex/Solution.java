package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
            if (dp[i] > max) {
                max = dp[i];
            }
        }
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