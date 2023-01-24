package com.codex;

import java.util.*;

public class Solution {
    public static int findGCD(int[] nums) {
        /** Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
         * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
         */

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            } else if (max < nums[i]) {
                max = nums[i];
            }
        }

        int gcd = 0;

        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    }