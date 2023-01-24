package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        
        Arrays.sort(nums);

        long result = 0;
        int i = 0, j = nums.length - 1;
        while (i < nums.length && j >= k) {
            if (nums[i] <= j + 1) {
                result += nums[j--];
            } else {
                result += j - k + 1;
                k++;
            }
        }

        while (k <= j) {
            result += j - k + 1;
            k++;
        }

        return result;
    }
}