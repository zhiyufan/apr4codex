package com.codex;

import java.util.*;

public class Solution {
    public static int minimumOperations(int[] nums) {
        
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            dp[i] = dp[i-1] + 1;
            if (nums[i] == nums[i-1]) dp[i] = Math.min(dp[i], dp[i-1]+1);
            if (i >= 2)
                if (nums[i] == nums[i-2]) dp[i] = Math.min(dp[i], dp[i-2]+1);
        }
        return dp[len-1];
    }

    
}