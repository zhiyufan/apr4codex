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
        boolean[] visited = new boolean[nums.length];
        int i = 0;
        for (int firstPos = 0; firstPos < nums.length && i < nums.length; firstPos++) {
            if (nums[firstPos] > 0) {
                res[i] = nums[firstPos];
                visited[firstPos] = true;
                i += 2;
            }
        }
        int j = 1;
        for (int firstNeg = 0; firstNeg < nums.length && j < nums.length; firstNeg++) {
            if (!visited[firstNeg] && nums[firstNeg] < 0) {
                res[j] = nums[firstNeg];
                visited[firstNeg] = true;
                j += 2;
            }
        }
        return res;
    }

    }