package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[k];
        dp[0] = nums[0];
        for (int i = 1; i < k; i++) {

        int maxIndex = 0;
            dp[i] = Math.max(dp[i - 1], nums[i]);
        }
        for (int i = k; i < n; i++) {
            if (dp[maxIndex] < nums[i]) {
                dp[maxIndex] = nums[i];
                maxIndex = 0;
                for (int j = 1; j < k; j++) {
                    if (dp[j] > dp[maxIndex]) {
                        maxIndex = j;
                    }
                }
            }
        }

        return dp;
    }

    
}