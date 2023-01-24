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
        int[] res = new int[n];
        int i = 0;
        for (int num : nums) {
            if (num > 0) {
                res[i] = num;
                i += 2;
            }
        }
        i = 1;
        for (int num : nums) {
            if (num < 0) {
                res[i] = num;
                i += 2;
            }
        }
        return res;
    }

    }