package com.codex;

import java.util.*;

public class Solution {
/*
Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
a <= b
b - a == k
*/




import java.util.*;

    public static int minDeletion(int[] nums) {
        int left = 0;
        int sum = 0;
        int max = 0;
        for (int i = 1; i < length; i++) {
            int n = nums[i] - nums[i - 1];
            sum += n;
            if (sum < left) {
                left = sum;
            }
            if (sum - left > max) {
                max = sum - left;
            }
        }
        return count;
    }

    
    
}