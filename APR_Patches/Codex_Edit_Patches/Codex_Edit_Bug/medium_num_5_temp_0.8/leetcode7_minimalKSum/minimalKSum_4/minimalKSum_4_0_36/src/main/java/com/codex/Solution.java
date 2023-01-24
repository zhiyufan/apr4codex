package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 0;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= curr+1) {
                k--;
                sum+=curr+1;
                curr++;                
            }
            else if (nums[i] <= curr+1) {
                k--;
                sum+=nums[i];
            }    
        }
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}