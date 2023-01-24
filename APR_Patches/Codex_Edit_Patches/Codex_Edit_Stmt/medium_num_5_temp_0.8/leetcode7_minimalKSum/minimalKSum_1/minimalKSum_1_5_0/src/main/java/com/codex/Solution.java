package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        while (k > 0) {
            if (k >= nums.length || nums[k] > k + 1) {
                sum += k + 1;
                k--;
            } else {
                k++;
            }
        }
        return sum;
    }

    
}