package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;

public class Solution {

    public static int[] maxSubsequence(int[] nums, int k) {

        if(nums.length < k){
            return new int[0];
        }

        int[] dp = new int[k + 1];
        int[] index = new int[k + 1]; // start of the max subsequence with length i

        for(int i = 1; i <= k; i++){
            int maxSum = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++){
                maxSum = Math.max(maxSum, nums[i - j - 1]);
            }
            dp[i] = maxSum;
            index[i] = i - 1;
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
}