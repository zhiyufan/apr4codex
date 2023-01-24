package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        int i = 0;
        while (i < nums.length && nums[i] <= curr) {
            if (nums[i] > curr) {
                k--;
                sum+=curr;
                curr++;
            } else if (nums[i] == curr) curr++;
            i++;
        }
        
        while (k > 0) {
            sum+=curr;
            curr++;
            k--;
        }
        return sum;
    }

    
}