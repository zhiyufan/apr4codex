package com.codex;

import java.util.*;

public class Solution {

package dynamic;

import java.util.Arrays;

public class MaxSubsequence {
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


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 5;
        System.out.println(Arrays.toString(maxSubsequence(nums,k)));
    }
}
}