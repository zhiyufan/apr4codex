package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] > i + 1) {
                sum += (long) (i + 1);
                k--; // This should be here, which is the main difference from longestDistinctSubarray
            }
        }
        sum += (pos + k - 1) * k / 2;
        return sum;
    }

    
}