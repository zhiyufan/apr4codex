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

        int[] res = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                res[pos] = nums[i];
                pos += 2;
            }
        }

        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] < 0) {
                res[neg] = nums[j];
                neg += 2;
            }
        }
        return res;
    }

    }