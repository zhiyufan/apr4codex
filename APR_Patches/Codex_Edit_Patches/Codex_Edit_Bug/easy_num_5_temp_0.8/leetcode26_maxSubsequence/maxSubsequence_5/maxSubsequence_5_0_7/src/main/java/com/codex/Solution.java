package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};

        int[] dp = new int[k];
        dp[0] = nums[0];
        for (int i = 1; i < k; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i]); // Maximum element in the first k elements.
        }
        for (int i = k; i < n; i++) {
            if (nums[i] > dp[k - 1]) {
                for (int j = 0; j < k - 1; j++) {
                    dp[j] = dp[j + 1]; // Remove the front element and update the second largest element.
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }

    
}