package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        while (k > 0) {
            if (k < nums.length) {
                sum += (long) nums[k - 1];
                k--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
}