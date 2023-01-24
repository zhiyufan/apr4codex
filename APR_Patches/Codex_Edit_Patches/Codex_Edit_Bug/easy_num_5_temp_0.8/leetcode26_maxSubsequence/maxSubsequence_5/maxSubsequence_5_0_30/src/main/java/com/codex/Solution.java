package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) { //time o(n), space o(k)
        
        
        int n = nums.length;
        if (n == 0) return nums;
        if (k == 0) return new int[0];
        if (k >= n) return nums;

        int[] dp = new int[k];
        dp[0] = nums[0];
        for (int i = 1; i < k; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i]);
        }
        for (int i = k; i < n; i++) {
            if (nums[i] > dp[k - 1]) {
                dp[0] = dp[1];
                for (int j = 1; j <= k - 1; j++) {
                    dp[j] = Math.max(dp[j - 1], dp[j]);
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }

    
}