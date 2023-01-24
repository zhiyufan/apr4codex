package com.codex;

import java.util.*;

public class Solution {
    public static int findGCD(int[] nums) {
        /** Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
         * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
         */

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        for (int i = smallest; i > 1; i--) {
            if (smallest % i == 0 && largest % i == 0) {
                return i;
            }
        }
        return 1;
    }
}}