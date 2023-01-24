package com.codex;

import java.util.*;

public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        /** You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
         * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
         * Return the minimum possible difference.
         */

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < nums.length; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;

    }

    }