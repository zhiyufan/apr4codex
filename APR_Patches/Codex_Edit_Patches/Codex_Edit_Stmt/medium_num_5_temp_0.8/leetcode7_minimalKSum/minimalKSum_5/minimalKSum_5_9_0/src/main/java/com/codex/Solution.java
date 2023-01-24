package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        int pos = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == pos) {
                pos++;
            } else if (nums[i] < pos) {
                continue;
            } else {
                sum += pos;
                k--;
                pos++;
                i--;
            }
        }
        
        while (k > 0) {
            sum += pos;
            pos++;
            k--;
        }
        return sum;
    }
}