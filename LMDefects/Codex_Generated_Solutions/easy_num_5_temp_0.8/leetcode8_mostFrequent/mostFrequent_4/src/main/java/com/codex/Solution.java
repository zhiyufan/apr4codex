package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        /** You are given a 0-indexed integer array nums. You are also given an integer key, which is present in nums.
         * For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums. In other words, count the number of indices i such that:
         * 0 <= i <= nums.length - 2,
         * nums[i] == key and,
         * nums[i + 1] == target.
         * Return the target with the maximum count. The test cases will be generated such that the target with maximum count is unique.
         */
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                int count = map.getOrDefault(nums[i + 1], 0);
                map.put(nums[i + 1], count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    }