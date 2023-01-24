package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[j-i+k-1] = nums[j];
                }
            }
        }
        return res;
    }





    


    class Solution {
    public int maxSubArray(int[] nums) {

        int max_here = nums[0];
        int max_so_far = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max_here = Math.max(nums[i], max_here+nums[i]);
            max_so_far = Math.max(max_so_far, max_here);
        }
        return max_so_far;

    }
}







    class Solution {
    public int maxSubArray(int[] nums) {

        int max_ending_here = nums[0];
        int max_so_far = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max_ending_here = Math.max(nums[i], max_ending_here+nums[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;

    }
}

    
}