package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        
        if (nums == null || nums.length == 0) return nums;
        int n = nums.length;
        if (k <= 0 || k > n) return new int[]{};
        if (k == n) return nums;

        int[] dp = new int[k];
        int tmp = 0;
        for (int i = 0; i < k; i++) {
            if (nums[i] > tmp) {
                tmp = nums[i];
                dp[i] = tmp;
            }else {
                dp[i] = tmp;
            }
        }
        for (int i = k; i < n; i++) {
            if (nums[i] > tmp && nums[i - k] == tmp) {
                dp[0] = nums[i];
                for (int j = 1; j < k; j++)
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                tmp = dp[k - 1];
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = dp[k - i - 1];
        }
        return res;
    }

    
}