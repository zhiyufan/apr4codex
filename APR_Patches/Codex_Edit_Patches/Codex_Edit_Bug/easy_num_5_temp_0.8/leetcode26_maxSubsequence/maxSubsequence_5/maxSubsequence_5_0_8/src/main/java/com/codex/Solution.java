package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int r) {
        
        if (nums == null || nums.length == 0) return new int[]{};
        int n = nums.length;
        if (k <= 0 || r >= n) return new int[]{};
        if (r == n - 1) return nums;

        for (int i = 1; i < r; i++) {
            for (int j = 0; j < n - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
                dp[k - 1] = nums[i];
            }
        }
        return dp;
    }

    
}