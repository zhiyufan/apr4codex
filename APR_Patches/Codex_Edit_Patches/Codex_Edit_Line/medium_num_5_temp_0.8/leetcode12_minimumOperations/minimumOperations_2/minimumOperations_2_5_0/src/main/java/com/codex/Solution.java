package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[nums.length];
        dp[0] = 1 - nums[0];
        dp[1] = 1 - Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            int a = dp[i - 2] + 1 - Math.abs(nums[i] - nums[i - 2]);
            int b = dp[i - 1] + 1 - Math.abs(nums[i] - nums[i - 1]);
            dp[i] = Math.min(a, b);
        }
        return dp[n - 1];
    }

    
}