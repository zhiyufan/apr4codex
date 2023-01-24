package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (i + 1 < n) {
                if (nums[i + 1] > nums[i]) {
                    dp[i + 1] = Math.min(dp[i + 1],  + dp[i] + (nums[i + 1] - nums[i]));
                }
                else {
                    dp[i + 1] = Math.min(dp[i + 1], dp[i] + (nums[i] - nums[i + 1]));
                }
            }
            if (i + 2 < n) {
                if (nums[i + 2] > nums[i]) {
                    dp[i + 2] = Math.min(dp[i + 2], dp[i] + (nums[i + 2] - nums[i]));
                }
                else {
                    dp[i + 2] = Math.min(dp[i + 2], dp[i] + (nums[i] - nums[i + 2]));
                }
            }
        }
        return dp[n - 1];
    }
}