package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (dp[i] == Integer.MAX_VALUE) continue;
            if (i + 1 < n) {
                dp[i + 1] = Math.min(dp[i + 1], dp[i] + Math.abs(nums[i + 1] - nums[i]));
            }
            j = i + 2;
            if (j < n) {
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(nums[j] - nums[i]));
            }
        }
        return dp[n - 1];
    }

    
}