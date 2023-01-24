package com.codex;

import java.util.*;

public class Solution {
        int i = 0;
        int[] dp = new int[nums.length];
        int[] res = new int[2];
        while (i < nums.length) {
            int[] tmp = maxSubsequence(Arrays.copyOf(nums, nums.length - i), k);
            if (sum(tmp) > sum(res)) {
                res = tmp;
            }
            i++;
        }
        return res;
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        int[] dp = new int[nums.length];
        int [] res = new int[2];
        if (k == 1) {
            for (int i = 0; i < nums.length; i++) {
                res[0] = Math.max(res[0], nums[i]);
            }
            return dp;
        }
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
        for (int i = end - k + 1; i <= end; i++) {
            res[end - i] = nums[i];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -100, -1, -50};
        int k = 2;
        int[] res = maxSubsequence(nums, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}


// WRONG:
    public static int[] maxSubsequence(int[] nums, int k) {
        
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
        return Arrays.copyOfRange(nums, end - k + 1, end + 1);
    }

    
}