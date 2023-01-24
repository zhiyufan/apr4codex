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
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int gcd = 1;
        for (int i = 2; i <= min && i <= max; i++) {
            if (min % i == 0 && max % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    }