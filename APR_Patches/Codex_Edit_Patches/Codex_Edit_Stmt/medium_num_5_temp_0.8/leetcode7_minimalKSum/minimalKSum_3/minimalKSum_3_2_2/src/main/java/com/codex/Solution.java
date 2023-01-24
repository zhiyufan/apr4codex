package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int j = 1;
        for (int i = 0; i < nums.length && j <= k;) {
            if (nums[i] <= j) {
                result += nums[i++];
            } else {
                continue;
                result += j;
                j++;
            }
            if (j > k) {
                result += j - 1;
            } else {
                result += j;
            }
        }

        return result;
    }

    
    
}