package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
 
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        while (k > 0) {
            if (i >= nums.length || nums[i] > i + 1) {
                sum += i + 1;
                k--;
            } else {
                i++;
            }
        }
        return sum; // add return statement
}
    
}