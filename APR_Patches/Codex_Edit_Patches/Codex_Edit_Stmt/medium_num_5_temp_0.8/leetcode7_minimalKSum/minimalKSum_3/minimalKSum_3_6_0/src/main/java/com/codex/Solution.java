package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int idx = i;
        int i = 0, j = 0;
        while (i < nums.length && j < k) {
            if (nums[i] <= j + 1) {
                result += nums[idx++];
            } else {
                result += j + 1;
                while(idx < nums.length && nums[idx] < j + 1) {
                    idx++;
                }
                i = idx;
            }
        }

        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;
    }

    
    
}