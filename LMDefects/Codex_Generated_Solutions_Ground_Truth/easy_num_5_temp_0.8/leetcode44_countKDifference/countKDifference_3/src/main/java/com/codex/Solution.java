package com.codex;

import java.util.*;

public class Solution {
    public static int countKDifference(int[] nums, int k) {
        /** Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
         * The value of |x| is defined as:
         * x if x >= 0.
         * -x if x < 0.
         */
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) count++;
            }
        }
        return count;
    }

    }