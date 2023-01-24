package com.codex;

import java.util.*;

public class Solution {
 public static long minimalKSum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);    
        int i = 0;
        int j = 0;
        long sum = 1;
        while (i < nums.length && k > 0) {
            if (sum >= nums[i]) {
                j = i + 1;
                while (j < nums.length && sum >= nums[j]) {
                    j++;
                }
                if (j == nums.length) {
                    sum += k;
                    k = 0;
                } else {
                    sum += nums[j] - nums[i];
                    k--;
                    i = j;
                }
            } else {
                sum += sum - nums[i];
                i--;
                k--;
            }
        }
        sum += (pos + k - 1) * k / 2;
        return sum;
    }

    
}