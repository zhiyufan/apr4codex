package com.codex;

import java.util.*;

public class Solution {
    public static int minimumDifference(int[] nums, int k) {
        /** You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
         * Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
         * Return the minimum possible difference.
         */

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        Arrays.sort(nums);
        if (k == 0) {
            return nums[len - 1] - nums[0];
        } else {
            return Math.min(nums[len - 1] - nums[len - k], nums[k - 1] - nums[0]);
        }
    }

    /**
     * Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
     *
     * Note:
     *
     * The solution set must not contain duplicate quadruplets.
     *
     * Example:
     *
     * Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
     *
     * A solution set is:
     * [
    }