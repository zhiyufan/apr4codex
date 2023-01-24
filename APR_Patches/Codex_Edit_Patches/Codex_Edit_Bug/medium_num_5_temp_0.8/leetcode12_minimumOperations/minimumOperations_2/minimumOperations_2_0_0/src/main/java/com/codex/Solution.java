package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = Math.abs(nums[1] - nums[0]);
        for (int i = 2; i < nums.length; i++) {           
            int a = dp[i - 2] + Math.max(nums[i], nums[i - 2]);
            int b = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);            
            dp[i] = Math.min(a, b);
        }
        return dp[nums.length - 1];
    }

    
}