package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        int pos = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos+1) {
                pos++;
            } else if (nums[i] <= pos+1) {
                continue;
            } else {
                sum += pos+1;
                k--;
                i--;
            }
        }
        sum += (pos + k + 1) * k / 2;
        return sum;
    }

    
}