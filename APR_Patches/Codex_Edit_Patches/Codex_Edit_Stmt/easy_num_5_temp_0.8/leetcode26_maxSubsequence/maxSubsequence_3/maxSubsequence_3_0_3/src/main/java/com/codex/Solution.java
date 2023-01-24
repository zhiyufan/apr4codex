package com.codex;

import java.util.*;

public class Solution {
 public int[] maxSubsequence(int[] nums, int k) {
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
        }
        int max = Integer.MIN_VALUE;
        int end = 0;
        for (int i = k - 1; i < nums.length; i++) {
            int sum = dp[i];
            if (i - k >= 0) {
                sum = sum - dp[i - k];
            }
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
      
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[end - k + 1 + i];
        }
      
        return res;
    }

    
}