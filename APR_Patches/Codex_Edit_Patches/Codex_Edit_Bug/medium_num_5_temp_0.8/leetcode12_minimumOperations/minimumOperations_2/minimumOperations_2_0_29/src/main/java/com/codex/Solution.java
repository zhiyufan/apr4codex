package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.abs(nums[0] - nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.min(dp[i - 2] + Math.abs(nums[i] - nums[i - 2]),
                        dp[i - 1] + Math.abs(nums[i] - nums[i - 1]));
        }
        return dp[nums.length - 1];
    }

    
}