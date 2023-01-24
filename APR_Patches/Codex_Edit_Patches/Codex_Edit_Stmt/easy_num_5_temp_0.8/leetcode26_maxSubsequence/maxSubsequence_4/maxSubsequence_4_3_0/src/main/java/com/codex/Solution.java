package com.codex;

import java.util.*;

public class Solution {
   class Solution {
    public List<Integer> maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;

        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int[] w = maxSub(nums, k);
        int[] s = maxSub(Arrays.copyOfRange(nums, k, n - k + 1), k);
        int[] e = maxSub(Arrays.copyOfRange(nums, n - k - k, n - k + 1), k);
        int maxSum = -1;
        for(int i = k; i <= n - k - k; ++i){
            if(w[i] + s[i - k] + e[i - k] > maxSum){
                maxSum = w[i] + s[i - k] + e[i - k];
                res = Arrays.asList(i - k, i, i + k);
            }
        }
        return res;
    
    private int[] maxSub(int[] nums, int k){
        int n = nums.length;
        if(n < k){
            return new int[0];
        }
        int[] ps = new int[n + 1];
        int[] dp = new int[n + 1];
        int[] idx = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            ps[i] = ps[i - 1] + nums[i - 1];
        }
        for(int i = 1; i <= n; ++i){
            if(i >= k){
                int j = idx[i - 1];
                while(j < i - 1 && dp[i - 1] - ps[j] >= ps[i] - ps[j + 1]){
                    j++;
                }
                dp[i] = Math.max(dp[i - 1], ps[i] - ps[j]);
                idx[i] = j;
            }
        }
        int[] res = new int[n - k + 1];
        int start = idx[n];
        for(int i = n - k; i >= 0; --i){
            while(start < n && ps[n] - ps[start] > dp[n] - ps[start + 1]){
                start++;
            }
            res[i] = n - start;
            n = start;
        }
        return res;
    }
}
    }
}