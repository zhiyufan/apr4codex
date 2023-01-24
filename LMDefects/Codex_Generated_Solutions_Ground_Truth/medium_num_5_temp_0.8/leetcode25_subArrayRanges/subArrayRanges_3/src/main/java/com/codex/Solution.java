package com.codex;

import java.util.*;

public class Solution {
    public static long subArrayRanges(int[] nums) {
        /** You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
         * Return the sum of all subarray ranges of nums.
         * A subarray is a contiguous non-empty sequence of elements within an array.
         */
        int length = nums.length;
        int[] leftMin = new int[length];
        int[] rightMax = new int[length];

        leftMin[0] = nums[0];
        for (int i = 1; i < length; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        rightMax[length - 1] = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        int result = 0;
        for (int i = 0; i < length; i++) {
            result += rightMax[i] - leftMin[i];
        }

        return result;
    }
}}