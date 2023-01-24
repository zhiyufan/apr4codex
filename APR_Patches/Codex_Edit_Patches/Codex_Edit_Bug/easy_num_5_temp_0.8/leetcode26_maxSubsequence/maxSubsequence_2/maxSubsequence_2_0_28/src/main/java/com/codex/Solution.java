package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            maxSum += nums[i];
        }  
        int currentSum = maxSum;
        int start = 0;
        for (int i = k; i < nums.length; i++) {         
            currentSum -= nums[start];
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                for (int j=0; j < k; j++) {
                  res[j] = nums[start+j];
                }
            }
        }
        return res;
    }


    
}