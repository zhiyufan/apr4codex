package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
<<<<<<< HEAD
        int sum = 0;
        for (int i = 0; i < k; i++) {
=======
            res[i] = nums[i]; 
            sum += nums[i];
>>>>>>> bd2586fdb1e0bff7b25dcf2a47a25f3c3a08a8aa
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


    
}