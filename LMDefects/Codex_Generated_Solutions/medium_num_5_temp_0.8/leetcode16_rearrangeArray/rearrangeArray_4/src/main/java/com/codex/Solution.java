package com.codex;

import java.util.*;

public class Solution {
    public static int[] rearrangeArray(int[] nums) {
        /** You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
         * You should rearrange the elements of nums such that the modified array follows the given conditions:
         * Every consecutive pair of integers have opposite signs.
         * For all integers with the same sign, the order in which they were present in nums is preserved.
         * The rearranged array begins with a positive integer.
         * Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
         */

        int n = nums.length;

        if (n == 1) {
            return nums;
        }

        int i = 0;
        int j = 1;
        while (i < n && j < n) {
            while (i < n && nums[i] < 0) {
                i += 2;
            }
            while (j < n && nums[j] > 0) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(nums, i, j);
            }
        }
        return nums;
    }

    }