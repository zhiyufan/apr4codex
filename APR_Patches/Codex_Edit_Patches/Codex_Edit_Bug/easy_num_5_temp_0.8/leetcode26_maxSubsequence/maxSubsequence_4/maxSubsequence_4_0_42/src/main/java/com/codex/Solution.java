package com.codex;

import java.util.*;

public class Solution {
int[] maxSubsequence(int[] nums, int k) {
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
}
//Test case
int[] nums = {1, 2, 3, 6, 7, 5, 8, 9, 4, 5, 6, 3, 7, 5, 3, 2, 6, 5};
int[] ans = maxSubsequence(nums, 4);

//Output
//ans = {7, 6, 5, 3}
//prefix sum = {0, 1, 3, 6, 12, 19, 24, 32, 41, 45, 50, 56, 63, 68, 73, 76, 78, 84, 89}
//dp = {0, 1, 3, 6, 24, 45}
//index = {0, 1, 2, 3, 4, 6}

//https://leetcode.com/problems/partition-to-k-equal-sum-subsets/discuss/461167/Intuitive-Java-DP-solution-beats-99.-Explained

public static int[] maxSubsequence(int[] nums, int k) {
    int n = nums.length;
    if (n < k) {
        return new int[0];
    }

    int[] prefixSum = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
    }

    int[] dp = new int[k + 1];
    int[] index = new int[k + 1];

    for (int i = 1; i <= k; i++) {
        int last = index[i - 1];
        while (last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]) {
            last++;

        dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
        index[i] = last;
    }
        int[] prefixSum = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

    int[] ans = new int[k];
    int start = index[k];
    for (int i = k - 1; i >= 0; i--) {
        while (start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]) {
            start++;
        }
        ans[i] = k - start;
        k = start;
    }

    return ans;
}
}