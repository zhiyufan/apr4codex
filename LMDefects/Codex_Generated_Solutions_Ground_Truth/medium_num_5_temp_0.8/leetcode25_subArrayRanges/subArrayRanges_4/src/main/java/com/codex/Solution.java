package com.codex;

import java.util.*;

public class Solution {
    public static long subArrayRanges(int[] nums) {
        /** You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
         * Return the sum of all subarray ranges of nums.
         * A subarray is a contiguous non-empty sequence of elements within an array.
         */
        int n = nums.length;
        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];
        prefixMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int min = suffixMin[i], max = prefixMax[i];
            for (int j = 0; j < i; j++) {
                min = Math.min(min, nums[j]);
            }
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max,}