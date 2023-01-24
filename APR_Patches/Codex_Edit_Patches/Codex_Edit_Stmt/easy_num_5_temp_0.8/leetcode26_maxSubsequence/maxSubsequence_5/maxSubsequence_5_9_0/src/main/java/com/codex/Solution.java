package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[k]; // 这个数组记录从当前点开始向后窗口长度为k的最大值
        dp[0] = nums[0]; // base case
        for (int i = 1; i < k; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i]);
        }
        for (int i = k; i < n; i++) {
            if (nums[i] > dp[k - 1]) {
                dp[0] = dp[1];
                for (int j = 1; j < k - 1; j++) {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }

    
}