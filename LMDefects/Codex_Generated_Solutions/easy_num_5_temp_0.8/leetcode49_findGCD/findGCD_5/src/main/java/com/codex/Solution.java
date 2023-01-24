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
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        int gcd = 1;
        for (int i = 1; i <= smallest; i++) {
            if (smallest % i == 0 && largest % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    }