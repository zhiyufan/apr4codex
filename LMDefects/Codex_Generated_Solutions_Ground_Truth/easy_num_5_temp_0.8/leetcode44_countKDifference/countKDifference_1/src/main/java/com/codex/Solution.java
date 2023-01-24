package com.codex;

import java.util.*;

public class Solution {
    public static int countKDifference(int[] nums, int k) {
        /** Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
         * The value of |x| is defined as:
         * x if x >= 0.
         * -x if x < 0.
         */

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k) && map.get(nums[i] - k) > 0) {
                result++;
                map.put(nums[i] - k, map.get(nums[i] - k) - 1);
            }
            if (map.containsKey(nums[i] + k) && map.get(nums[i] + k) > 0) {
                result++;
                map.put(nums[i] + k, map.get(nums[i] + k) - 1);
            }
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return result;
    }}