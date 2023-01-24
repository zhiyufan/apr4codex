package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        int  i = 0;
        while (i < nums.length && k > 0) {
            if (nums[i] < curr) {
                i++;
            } else if (nums[i] == curr) {
                i++;
                curr++;
            } else {
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