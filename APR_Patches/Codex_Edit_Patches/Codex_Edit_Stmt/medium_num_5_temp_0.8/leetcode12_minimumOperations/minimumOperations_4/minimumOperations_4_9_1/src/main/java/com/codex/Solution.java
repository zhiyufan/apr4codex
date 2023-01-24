package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int count = 0;
        int n = nums.length + 1;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n - 1;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
            }
            if (i + 2 < n) {
                dp[i + 2] = Math.min(dp[i + 2], dp[i] + Math.abs(nums[i + 2] - nums[i]));
            }
        }
        return dp[n - 2];
    }

    
}