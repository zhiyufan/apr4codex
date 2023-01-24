package com.codex;

import java.util.*;

public class Solution {
    public static int countKDifference(int[] nums, int k) {
        /** Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
         * The value of |x| is defined as:
         * x if x >= 0.
         * -x if x < 0.
         */
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                }