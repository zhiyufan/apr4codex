package com.codex;

import java.util.*;

public class Solution {
class Solution {
    public int[] maxSubarraySumCircular(int[] A) {
        if(A == null || A.length == 0){
            return new int[2];
        }

        int[] left = new int[A.length];
        int[] right = new int[A.length];
        left[0] = A[0];
        right[A.length - 1] = A[A.length - 1];
        int sum = A[0];
        int maxSum = A[0];
        
        for(int i = 1; i < A.length; ++i){
            left[i] = Math.max(left[i - 1] + A[i], A[i]);
            maxSum = Math.max(maxSum, left[i]);
            sum += A[i];
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