package com.codex;

import java.util.*;

public class Solution {
// Test cases
// 1. input = [1, 2, 3, 2, 4], k = 4, output = [3, 2, 4]

    public static int[] maxSubsequence(int[] nums, int k) {

        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[k];
        int s = 0, e = 0;
        for (int i = 0; i < k; i++) dp[i] = nums[i];
        for (int i = k; i < n; i++) {
            if (nums[i] > dp[k - 1] || nums[i] < dp[0]) {
                if (dp[k - 1] < nums[i]) {
                    dp[k - 1] = nums[i];
                    s = i - k + 1;
                    e = i;
                } else {
                    dp[k - 1] = nums[i];
                    for (int j = k - 2; j >= 0 && nums[i] < dp[j]; j--) {
                        dp[j + 1] = dp[j];
                        if (j == 0) dp[0] = nums[i];
                    }
                    s = i - k + 1;
                    e = i;
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }
}