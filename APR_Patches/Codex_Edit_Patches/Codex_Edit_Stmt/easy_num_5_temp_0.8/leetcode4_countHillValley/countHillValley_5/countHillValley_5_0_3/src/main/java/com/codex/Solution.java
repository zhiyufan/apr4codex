package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }


## Question 2

### Description

Given an array of integers, find the subarray with smallest sum.

Return the sum of the subarray.

### Assumptions

The given array is not null and has length of at least 1.

### Examples

{1, -1, -2, 1}, the smallest subarray sum is -3.

### Solutions
}