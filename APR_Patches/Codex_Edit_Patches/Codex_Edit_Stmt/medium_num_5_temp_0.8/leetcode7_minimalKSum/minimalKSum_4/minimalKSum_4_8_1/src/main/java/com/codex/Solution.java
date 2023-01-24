package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int curr = nums[0];
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr) {
                continue;
            }
            if (nums[i] > curr) {
                k--;
                sum += curr;
                curr++;
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