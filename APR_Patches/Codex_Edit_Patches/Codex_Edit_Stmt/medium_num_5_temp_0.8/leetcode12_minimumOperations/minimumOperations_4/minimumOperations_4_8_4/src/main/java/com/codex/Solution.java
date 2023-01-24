package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        //dp[0] = 0;
        dp[0] = 0;
        for (int i = 0;i < n;i++) {
            if (i == 0) {
                dp[i] = Math.abs(nums[i]);
            } else if (i == 1) {
                dp[i] = Math.abs(nums[i] - nums[i - 1]);
            } else {
                dp[i] = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
                dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(nums[i] - nums[i - 2]));
            }
       }
        return dp[n - 1];
    }

    
}