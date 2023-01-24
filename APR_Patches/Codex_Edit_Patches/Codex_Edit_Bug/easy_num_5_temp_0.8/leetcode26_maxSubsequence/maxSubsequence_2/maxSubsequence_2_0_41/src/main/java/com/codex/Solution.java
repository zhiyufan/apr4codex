package com.codex;

import java.util.*;

public class Solution {

    /**
     * 
     * @param nums
     * @param k
     * @return
     */
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
                int pos = maxSum(res, maxSum);
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                for (int j = i-k+1; j <= i; j++) {
                    res[pos++] = nums[j];
                }
            }
        }
        return res;
    }
    /**
     * 
     * @param res
     * @param sum
     * @return
     */
    private static int maxSum(int[] res, int sum) {
        int maxSum = 0;
        int position = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
            if (sum > maxSum) {
                position = i++;
            }
        }
        return position;
    }



    
}