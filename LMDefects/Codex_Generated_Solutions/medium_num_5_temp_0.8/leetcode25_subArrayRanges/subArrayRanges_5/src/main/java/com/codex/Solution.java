package com.codex;

import java.util.*;

public class Solution {
    public static long subArrayRanges(int[] nums) {
        /** You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
         * Return the sum of all subarray ranges of nums.
         * A subarray is a contiguous non-empty sequence of elements within an array.
         */
        long total = 0;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int min = nums[i], max = nums[i];
            for (int j = i; j < N; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                total += max - min;
            }
        }
        return total;
    }

    }