package com.codex;

import java.util.*;

public class Solution {
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

    

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int k = 2;
        System.out.println(maxSubsequenceProduct(nums, k));
    }
    
    public static int maxSubsequenceProduct(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int temp = 1;
            for (int j = i; j < i + k; j++) {
                temp *= nums[j];
            }
            if (temp > max) {
                max = temp;
            }
        }
        
        return max;
    }
    
}