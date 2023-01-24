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
        int count = 0;
        int max = 0;
        int mostFreq = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                count = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j-1] && nums[j] == nums[i + 1]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    mostFreq = nums[i + 1];
                }
            }
        }
        return mostFreq;
    }

    }