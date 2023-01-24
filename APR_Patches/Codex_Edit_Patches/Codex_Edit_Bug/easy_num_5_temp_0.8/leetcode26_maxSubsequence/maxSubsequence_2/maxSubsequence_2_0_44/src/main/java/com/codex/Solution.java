package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
    int[] res = new int[k];
    int maxSum = 0;
    int sum = 0;
    for (int i = 0; i < k; i++) {
        res[i] = nums[i];
        int sum = 0;
    }
    maxSum = sum;
    for (int i = k; i < nums.length; i++) {
        sum -= nums[i-k];
        sum += nums[i];
        if (sum > maxSum) {
            maxSum = sum;
            for (int j = i-k+1; j <= i; j++) {
                res[j-i+k-1] = nums[j];
            }
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


    
}