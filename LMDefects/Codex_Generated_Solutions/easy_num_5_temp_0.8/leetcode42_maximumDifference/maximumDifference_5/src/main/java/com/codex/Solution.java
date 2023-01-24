package com.codex;

import java.util.*;

public class Solution {
    public static int maximumDifference(int[] nums) {
        /** Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
         * 8 Return the maximum difference. If no such i and j exists, return -1.
         */
        if (nums.length < 2)
            return -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    max = Math.max(max, nums[j] - nums[i]);
                }
            }
        }
        return max;
    }

    }