package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
         // Sort array
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        int n = nums.length;
        while (k > 0) {
            if (i >= n  || (nums[i] > i + 1 && i == 0) ) {
                // Bug
                sum += i + 1;
                k--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
}