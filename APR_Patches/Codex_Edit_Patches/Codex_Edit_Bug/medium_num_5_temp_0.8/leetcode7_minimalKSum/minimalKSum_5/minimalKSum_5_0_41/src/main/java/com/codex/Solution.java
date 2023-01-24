package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {

        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        int kpos = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == kpos) {
                kpos++;
            } else if (nums[i] < kpos) {
                continue;
            } else {
                sum += kpos;
                k--;
                kpos++;
                i++;
            }
        }
        sum += kpos * k + (k * (k - 1)) / 2;
        return sum;
    }
}