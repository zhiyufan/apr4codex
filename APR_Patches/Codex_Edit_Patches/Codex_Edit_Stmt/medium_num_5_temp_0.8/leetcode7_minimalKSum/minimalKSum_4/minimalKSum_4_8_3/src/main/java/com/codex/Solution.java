package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = 1;
        long sum = 0;
        if (nums.length == 0) return 0;
        if (nums[0] > 1) return (long) nums[0] * k;
        if (nums[0] == 1) {
            curr = 2;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > curr) {
                if (k == 1) return sum + (long) nums[i];
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