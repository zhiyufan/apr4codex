package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int a = dp[i - 2] + nums[i];
            int b = dp[i - 1] + nums[i];
            dp[i] = Math.min(a, b);
        }
        return dp[nums.length - 1] - nums[nums.length - 1];
    }

    
}