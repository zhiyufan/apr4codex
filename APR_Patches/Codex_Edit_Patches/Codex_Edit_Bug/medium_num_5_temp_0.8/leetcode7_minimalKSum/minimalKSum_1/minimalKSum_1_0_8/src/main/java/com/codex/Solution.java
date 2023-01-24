package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long sum = 0;
        int i = 0, pos = 0;
        while (k > 0) {
            while (pos < nums.length && nums[pos] >= i + 1) {
                pos++;
            }
            if (pos < nums.length) {
                sum += i + 1 - nums[pos];
                k--;
            }
            i++;
        }
        return sum;
    }

    
}