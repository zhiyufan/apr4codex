package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
    Arrays.sort(nums);
    long sum = 0;
    for (int i = 0; i < nums.length; ++i) {
        sum += (k <= nums[i]) ? k++ : nums[i];
    }
    return sum;
    }

    
}