package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        for (int i = 1; i < n; i++) {
            if (nums[i] > dp[0]) {
                dp[0] = nums[i];
            }
        }
        int[] dp = new int[k];
        dp[0] = nums[0];
        for (int i = 1; i < k; i++) {
            dp[i] = nums[i];
        }
            int j = i - k;
            if (nums[i] > dp[0]) {
                dp[0] = nums[i];
                j = i - k + 1;
            }
            for (; j < i; j++) {
                dp[j - i + k] = Math.max(dp[j - i + k], nums[j]);
            }
        }
        return dp;
    }
}