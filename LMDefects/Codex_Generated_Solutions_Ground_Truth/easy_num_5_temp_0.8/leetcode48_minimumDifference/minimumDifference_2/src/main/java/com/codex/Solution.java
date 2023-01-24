package com.codex;

import java.util.*;

public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        /** You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
         * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
         * Return the minimum possible difference.
         */
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }
        return min;
    }

    }