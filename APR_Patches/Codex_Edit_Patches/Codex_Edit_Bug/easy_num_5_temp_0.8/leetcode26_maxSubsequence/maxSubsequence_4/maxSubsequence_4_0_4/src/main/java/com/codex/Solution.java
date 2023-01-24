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

        for(int i = 1; i <= k; ++i){
            int last = index[i - 1] + 1;
            while(last <= n - k + i && dp[i - 1] - prefixSum[last - 1] >= prefixSum[last] - prefixSum[last - 1]){
                last--;
            }
            index[i] = last;
            dp[i] = Math.max(dp[i - 1], prefixSum[last + i - 1] - prefixSum[last - 1]);
        }
        int[] ans = new int[k];
        int start = index[k];
        for(int i = k; i >= 1; --i){
            while(start < n - k + i && prefixSum[start + i] - prefixSum[start] > dp[i] - prefixSum[start - 1]){
                start++;
            }
            ans[i - 1] = start;
        }

        return ans;
}
}