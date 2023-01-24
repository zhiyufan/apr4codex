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
            int tempSum = sum;
            while (tempSum > 0) {
                int index = i - k;
                tempSum -= nums[index];
                k--;
            }
            for (int j = i-k; j <= i; j++) {
                if (nums[j] > nums[index]) {
                    index = j;
                }
            }
        }
        return res;
    }


    
}