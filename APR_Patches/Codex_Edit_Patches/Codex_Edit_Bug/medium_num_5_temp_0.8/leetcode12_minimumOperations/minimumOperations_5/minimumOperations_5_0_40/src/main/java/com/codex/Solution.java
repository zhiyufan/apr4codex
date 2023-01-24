package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++){
            dp[i] = dp[i - 1] + nums[i - 1];
            if (i >= 2 && nums[i] == nums[i - 2]){
                dp[i] = Math.min(dp[i], dp[i - 2] + nums[i]);
            }
        }
        return dp[n - 1];
    }

    
}