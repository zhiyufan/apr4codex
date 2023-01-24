package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i, j;
        for (i = 0, j = 1; k > 0; j++) {
            if (i >= nums.length || nums[i] > j) {
                sum += i + 1;
                k--;
            } else {
                sum += nums[i];
                i++;
            }
        }
        return sum;
    }

    
}