package com.codex;

import java.util.*;

public class Solution {
    public static long minimalKSum(int[] nums, int k) {
        /** You are given an integer array nums and an integer k. Append k unique positive integers that do not appear in nums to nums such that the resulting total sum is minimum.
         * Return the sum of the k integers appended to nums.
         */
        Arrays.sort(nums);
        int size = nums.length;
        long sum = 0;
        long pos = 1;
        for (int i = 0; i < size && k > 0; i++) {
            if (nums[i] == pos) {
                pos++;
            } else if (nums[i] < pos) {
                continue;
            } else {
                sum += pos;
                k--;
                pos++;
                i--;
            }
        }
        sum += (((pos + k - 1) * (pos + k)) / 2) -  ((pos * (pos - 1) ) / 2);
        return sum;
    }

    }