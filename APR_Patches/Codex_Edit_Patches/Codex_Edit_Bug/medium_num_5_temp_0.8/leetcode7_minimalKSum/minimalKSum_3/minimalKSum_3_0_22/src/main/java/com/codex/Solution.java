package com.codex;

import java.util.*;

public class Solution {
public static long minimalKSum(int[] nums, int k) {
    Arrays.sort(nums);

    long result = 0;
    for (int i = 0, j = 0; i < nums.length; i++) {
        if (nums[i] <= j + 1) {
            result += nums[i];
        } else {
            result += j + 1;
            j++;
        }
    }

    return result;
}
    
    
}