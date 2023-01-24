package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (k > 0) {
            if (i >= nums.length || nums[i] >= i + 1) {
                sum += i + 1; // Dont't add the actual minimum. Add i+1 every time.
                k--;
            } else {
                min = Math.min(min, nums[i]);
                i++;
            }
        }
        return sum;
    }

    
}