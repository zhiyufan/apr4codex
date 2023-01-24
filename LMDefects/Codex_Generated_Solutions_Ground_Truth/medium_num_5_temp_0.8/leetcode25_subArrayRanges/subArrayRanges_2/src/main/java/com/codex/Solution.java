package com.codex;

import java.util.*;

public class Solution {
    public static long subArrayRanges(int[] nums) {
        /** You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
         * Return the sum of all subarray ranges of nums.
         * A subarray is a contiguous non-empty sequence of elements within an array.
         */
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                sum += max - min;
            }
        }
        return sum;
    }

    }