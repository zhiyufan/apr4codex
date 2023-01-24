package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[j] = max(dp[j], nums[i]);
            }
        }
        return dp;
    }

    private static int max(int a, int b) {
        return (a > b)? a: b;
    }

    
}