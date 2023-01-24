package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        long curr = 1, sum = 0;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            
            if (nums[i] < curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}