package com.codex;

import java.util.*;

public class Solution {
    public static int maximumDifference(int[] nums) {
        /** Given a 0-indexed integer array nums of size n, find the maximum difference between nums[i] and nums[j] (i.e., nums[j] - nums[i]), such that 0 <= i < j < n and nums[i] < nums[j].
         * 8 Return the maximum difference. If no such i and j exists, return -1.
         */
        if (nums == null || nums.length == 0) return -1;
        int res = 0;
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - min > res) {
                res = nums[i] - min;
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return res;
    }

    }