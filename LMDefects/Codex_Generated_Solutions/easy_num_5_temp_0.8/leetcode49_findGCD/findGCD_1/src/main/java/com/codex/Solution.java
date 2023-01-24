package com.codex;

import java.util.*;

public class Solution {
    public static int findGCD(int[] nums) {
        /** Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
         * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
         */

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        return min;
    }

    }