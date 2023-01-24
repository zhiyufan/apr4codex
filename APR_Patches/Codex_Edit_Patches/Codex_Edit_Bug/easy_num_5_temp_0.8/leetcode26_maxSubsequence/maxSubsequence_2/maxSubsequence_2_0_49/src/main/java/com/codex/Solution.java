package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int sum = 0, maxSum = 0, startPoint = 0, endPoint = 0;
        
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