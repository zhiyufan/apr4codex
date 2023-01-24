package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] <= j + 1) {
                result += nums[i++];
            } else {
                result += j + 1;
                j++;
            }
        }
        
        if (j < k) result += (k - j) * (k + 1) / 2;
        
        return result;
    }

    
    
}