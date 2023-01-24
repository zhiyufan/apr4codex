package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        long sum = 0;
        if (nums.length == 0)
            return sum;
        Arrays.sort(nums);
        int size = nums.length;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos) {
                pos++;
            } else if (nums[i] > pos) {
                sum += pos;
                k--;
                pos++;
                i--;
            }
            if (k == 0)
                break;
        }
        if (k > 0) {
            sum += (pos + k - 1) * k / 2;
        }
        return sum;
    }

    
}