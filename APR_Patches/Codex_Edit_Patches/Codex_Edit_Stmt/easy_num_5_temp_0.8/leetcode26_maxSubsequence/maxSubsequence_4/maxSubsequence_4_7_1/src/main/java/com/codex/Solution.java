package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {

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

        index[0] = -1;
        for(int i = 1; i <= k; ++i){
            int last = index[i];
            while(last < i - 1 && dp[i - 1] - prefixSum[last + 1] >= prefixSum[i] - prefixSum[last]){
                last--;
            }
            dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last + 1]);
            index[i] = last + 1;
        }
        int[] ans = new int[k];
        int start = index[k];
        for(int i = k - 1; i >= 0; --i){
            while(start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]){
                start++;
            }
            ans[i] = start;
            k = start;
        }

        return ans;

    }
}