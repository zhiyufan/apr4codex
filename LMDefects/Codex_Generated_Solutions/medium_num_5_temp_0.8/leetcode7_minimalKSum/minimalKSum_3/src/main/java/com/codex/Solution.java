package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        /** You are given an integer array nums and an integer k. Append k unique positive integers that do not appear in nums to nums such that the resulting total sum is minimum.
         * Return the sum of the k integers appended to nums.
         */
        Arrays.sort(nums);

        long result = 0;
        int i = 0, j = 0;
        while (i < nums.length && j < k) {
            if (nums[i] <= j + 1) {
                result += nums[i++];
            } else {
                result += j + 1;
                j++;
            }
        }

        while (j < k) {
            result += j + 1;
            j++;
        }

        return result;
    }

    /**
     *
     * A string s is called good if there are no two different characters in s that have the same frequency.
     * <p>
     * Given a string s, return the minimum number of characters you need to delete to make s good.
     * <p>
     * The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
     */
    }