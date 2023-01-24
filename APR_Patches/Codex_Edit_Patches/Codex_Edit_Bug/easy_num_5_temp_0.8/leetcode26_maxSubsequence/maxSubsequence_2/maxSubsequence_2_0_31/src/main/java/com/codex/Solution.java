package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
<<<<<<< HEAD
            sum += nums[i];
        }
=======
        int maxSum = sum; for (int i = k; i < nums.length; i++) {
>>>>>>> d24b1c1e2748ad0b8063e2f8c2b3810d9e9e36ee
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


    
}