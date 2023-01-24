package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            for (int j = i + 1;j < n;j++) {
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(nums[j] - nums[i]));
            }
            for (int j = i + 2;j < n;j++) {
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(nums[j] - nums[i + 1]));
            }
        }
        return dp[n - 1];
    }

    
}