package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
        

        int sum = 0;
        int start = 0;

        int[] res = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sum += nums[i];
        int maxStart = 0;
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];
            if (sum >= maxSum) {
                if (sum > maxSum) {
                    maxStart = start;
                    //maxEnd = i;
                }
                maxSum = sum;                
            }else{
                start++;
            }
        }
        for (int j = maxStart; j < maxStart+k; j++) {
                    res[j-maxStart] = nums[j];
        }
        return res;
    }


}