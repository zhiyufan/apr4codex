package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int i = 0; 
        int j = 0;
        
        while (j < k && i < nums.length) {
            if (nums[i] <= k && nums[i] >= j + 1) {
                result += nums[i++];
            } else {
                j++
            }
        }

        while (j < k && i < nums.length) {
            result += j + 1;
            j++;
        }
        
        return result;
    }

    
    
}