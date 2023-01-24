package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 0; i < n - 1; i++) {
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
        }
        for (int i = 0; i < n - 2; i++) {
            dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i]));
        }
        return dp[n - 1];
    }

    
}