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

    private int partition(int[] nums, int i, int j, int pivotIndex){

        int pivotValue = nums[pivotIndex];

        swap(nums, pivotIndex, j);

        int storeIndex = i;
        for(int k = i; k < j; ++k){
            if(nums[k] <= pivotValue){
                swap(nums, k, storeIndex);
                storeIndex++;
            }
        }

        swap(nums, storeIndex, j);
        
        return storeIndex;
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;

        if(k > n){
            return 0;
        }

        int l = 0, r = n - 1;
        while(l < r){
            int pivotIndex = partition(nums, l, r, l + 1);
            if(n - pivotIndex == k){
                return nums[pivotIndex];
            }else if(n - pivotIndex < k){
                r = pivotIndex - 1;
            }else{
                l = pivotIndex + 1;
            }
        }

        return nums[l];
    }
    }
}