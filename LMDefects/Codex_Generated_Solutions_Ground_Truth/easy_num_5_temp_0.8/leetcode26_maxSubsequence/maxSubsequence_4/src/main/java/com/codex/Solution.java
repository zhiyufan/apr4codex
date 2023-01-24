package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        /** You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
         * Return any such subsequence as an integer array of length k.
         * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
         */
        int n = nums.length;

        if(n < k){
            return new int[0];
        }

        int[] prefixSum = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int[] dp = new int[k + 1];
        int[] index = new int[k + 1];

        for(int i = 1; i <= k; ++i){
            int last = index[i - 1];
            while(last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]){
                last++;
            }
            dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
            index[i] = last;
        }
        int[] ans = new int[k];
        int start = index[k];
        for(int i = k - 1; i >= 0; --i){
            while(start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]){
                start++;
            }
            ans[i] = k - start;
            k = start;
        }

        return ans;
    }}