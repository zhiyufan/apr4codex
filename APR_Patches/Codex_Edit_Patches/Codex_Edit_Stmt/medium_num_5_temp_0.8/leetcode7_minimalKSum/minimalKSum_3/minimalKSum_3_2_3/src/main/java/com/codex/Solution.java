package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int i = 0, j = 1;
        while (i < nums.length && j <= k) {
            if (nums[i] <= j) {
                result += (long) nums[i++];
            } else {
                result += (long) j;
                j++;
            }
        }

        while (j < k) {
            result += (long) j;
            j++;
        }

        return result;
    }

    
    
}