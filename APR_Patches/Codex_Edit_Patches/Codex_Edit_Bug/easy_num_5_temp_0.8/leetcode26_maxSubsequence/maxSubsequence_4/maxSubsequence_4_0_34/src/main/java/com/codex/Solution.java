package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
         //if(n < k){
         //   return new int[0];
       // }
        int[] prefixSum = new int[n + 1];
         for(int i = 1; i <= n; ++i){
             prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        int[] dp = new int[k + 1];
        int[] index = new int[k + 1];
        
       int[] ans = new int[n - k + 1];
       int start = 0;
       for(int i = k; i <= n; ++i) {
           int last = index[i - 1];
            while(last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]){
                last++;
            }
            dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
            index[i] = last;
            ans[start++] = dp[i];
        }
       return ans; 
    }
}
    


//You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
//
//Notice that x does not have to be an element in nums.
//
//Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
//
// 
//
//Example 1:
//
//Input: nums = [3,5]
//Output: 2
//Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
//Example 2:
//
//Input: nums = [0,0]
//Output: -1
//Explanation: No numbers fit the criteria for x.
//If x = 0, there should be 0 numbers >= x, but there are 2.
//If x = 1, there should be 1 number >= x, but there are 0.
//If x = 2, there should be 2 numbers >= x, but there are 0.
//x cannot be greater since there are only 2 numbers in nums.
//Example 3:
//
//Input: nums = [0,4,3,0,4]
//Output: 3
//Explanation: There are 3 values that are greater than or equal to 3.
//Example 4:
//
//Input: nums = [3,6,7,7,0]
//Output: -1
// 
//
//Constraints:
//
//1 <= nums.length <= 100
//0 <= nums[i] <= 1000
}