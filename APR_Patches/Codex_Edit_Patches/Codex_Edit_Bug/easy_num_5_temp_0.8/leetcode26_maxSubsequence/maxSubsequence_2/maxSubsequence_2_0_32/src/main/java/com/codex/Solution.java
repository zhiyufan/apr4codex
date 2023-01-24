package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {
        

        int[] res = new int[k];
        int[] sums = new int[nums.length];

        for (int i = 0; i < k; i++) {
            res[i] = nums[i];
            sums[0] += nums[i];
        }

        for (int i = 1; i <= nums.length - k; i++) {
            sums[i] = sums[i - 1] - nums[i - 1] + nums[i + k - 1];
        }

        int maxSum = sums[0];
        int index = 0;
        for (int i = 1; i <= nums.length - k; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                index = i;
                for (int j = i; j < i + k; j++) {
                    res[j-i+k-1] = nums[j];
                }
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = nums[index + i];
        }
        return res;
    }


    
}