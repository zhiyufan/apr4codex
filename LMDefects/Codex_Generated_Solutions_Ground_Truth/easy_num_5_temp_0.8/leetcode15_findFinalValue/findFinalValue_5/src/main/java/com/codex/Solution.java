package com.codex;

import java.util.*;

public class Solution {
    public static int findFinalValue(int[] nums, int original) {
        /** You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.
         * You then do the following steps:
         * If original is found in nums, multiply it by two (i.e., set original = 2 * original).
         * Otherwise, stop the process.
         * Repeat this process with the new number as long as you keep finding the number.
         * Return the final value of original.
         */
        int count = 0;
        while (count < nums.length) {
            if (nums[count] == original) {
                original = original * 2;
                count = 0;
            } else {
                count++;
            }
        }
        return original;
    }
}}