package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = dp[i];
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        return Arrays.copyOfRange(nums, end - k + 1, end + 1); // this whole thing is O(n)
    }

    
}