package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], Math.abs(nums[i + 1] - nums[i]) + (i == 0 ? 0 : dp[i]));
            }
            if (i + 2 < n) {
                dp[i + 2] = Math.min(dp[i + 2], Math.abs(nums[i + 2] - nums[i]) + (i == 0 ? 0 : dp[i]));
            }
        }
        return dp[n - 1];
    }

    
}