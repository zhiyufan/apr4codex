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

       //In order to get the max squared sum in the array,
    //we have to check if we are going to use the subarray at index i-1
    //if we use the subarray at i-1, we need to find the max of the squared subarray before i, which is dp[i-1]
    //if we don't use the subarray at i-1, we need to find the max of the squared subarray at i, which is max[i] * max[i]
    //so the max squared sum at index i is Math.max(dp[i-1], max[i] * max[i]);
    //return array, substract the max number with 1, then return the array
    public static int[] maxSqSub(int[] nums) {
        int[] dp = new int[nums.length];
        int[] max = Arrays.copyOf(nums, nums.length);
        int max_sq = Integer.MIN_VALUE;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            max[i] = Math.max(Math.max(max[i - 1], dp[i - 1]), num);
            dp[i] = Math.max(dp[i - 1], max[i] * max[i]);
            max_sq = Math.max(max_sq, dp[i]);
        }
        int ret = max_sq;
        int index = nums.length - 1;
        boolean[] used = new boolean[nums.length];
        int cur = max_sq;
        while (index >= 0) {
            int num = nums[index];
            if (dp[index] != cur) {
                used[index] = true;
                cur = Math.max(max[index - 1], dp[index - 1]);
            }
            index--;
        }
        int[] res = new int[ret];
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                res[index2] = nums[i];
                index2++;
            }
        }
        return res;
    }
}