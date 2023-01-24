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
        Arrays.sort(nums);
        int i = 1;
        int j = nums.length - 1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i += 2;
            j -= 2;
        }
        return nums;
    }

    }