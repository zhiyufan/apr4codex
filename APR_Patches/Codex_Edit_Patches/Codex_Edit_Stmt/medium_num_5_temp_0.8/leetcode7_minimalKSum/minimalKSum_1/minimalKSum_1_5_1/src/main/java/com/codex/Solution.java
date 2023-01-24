package com.codex;

import java.util.*;

public class Solution {
     public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i = 1;
        while (k > 0) {
            if (i > nums.length || nums[i - 1] > i) {
                sum += i;
                k--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
}