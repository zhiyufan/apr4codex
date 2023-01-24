package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        /*
        [4,2,2,4,4,2,2,4,2,2,4,4,2,4,4,4,4,4,4,4,4,4]
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
        int[] ans = new int[k + 1];
        int end = index[k];
        for(int i = k; i >= 1; --i){
            while(end < n && prefixSum[n] - prefixSum[end] >= dp[i] - prefixSum[end + 1]){
                end++;
            }
            ans[i] = end + 1;
            n = end;
        }

        int[] arr = new int[k];
        for(int i = 1; i <= k; ++i){
            arr[i - 1] = ans[i];
        }
        return arr;
    }
}