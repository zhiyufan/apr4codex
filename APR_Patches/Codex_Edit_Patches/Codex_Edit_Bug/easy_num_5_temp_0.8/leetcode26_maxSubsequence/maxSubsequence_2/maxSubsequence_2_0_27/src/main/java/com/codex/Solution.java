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
        for (int i = k; i < nums.length; i++) { // first calculate the sum
            sum -= nums[i - k];
            sum += nums[i]; // if the sum is greater than the prev max sum
            if (sum > maxSum) { // update the max sum
                maxSum = sum; // and also the subsequence
                res = Arrays.copyOfRange(nums, i - k + 1, i + 1);
            }
        }
        return res;
    }


    
}