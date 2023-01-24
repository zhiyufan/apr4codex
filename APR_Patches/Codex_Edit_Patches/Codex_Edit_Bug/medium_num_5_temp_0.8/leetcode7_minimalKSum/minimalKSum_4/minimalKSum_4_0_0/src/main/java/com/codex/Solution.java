package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k, int n) {
        
        long result = 0;
        if (n == 1) {
            result = 0;
        } else if (k == 0) {
            result = 0;
        } else {
            int p = n;
            for (int i = 0; i < n; i++) {
                if (nums[i] < p) {
                    p = nums[i];
                }
            }
            result = p + minimalKSum(nums, k-1, n-1);
        }
        return result;
    }

    
}