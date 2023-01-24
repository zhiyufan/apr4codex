package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int m = 0;
        while (k > 0) {
            if (m >= nums.length || nums[m] > m + 1) {
                sum += m + 1;
                k--;
            } else {
                m++;
            }
        }
        return sum;
    }

    
}