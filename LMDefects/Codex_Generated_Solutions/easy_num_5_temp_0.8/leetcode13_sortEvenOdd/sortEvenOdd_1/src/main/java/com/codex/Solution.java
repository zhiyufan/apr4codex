package com.codex;

import java.util.*;

public class Solution {
    public static int[] sortEvenOdd(int[] nums) {
        /** You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:
         * Sort the values at odd indices of nums in non-increasing order.
         * For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
         * Sort the values at even indices of nums in non-decreasing order.
         * For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
         * Return the array formed after rearranging the values of nums.
         */
        for (int i = 1; i < nums.length; i += 2) {
            int max = nums[i], maxIndex = i;
            for (int j = i; j < nums.length; j += 2) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = max;
            nums[maxIndex] = tmp;
        }
        for (int i = 0; i < nums.length; i += 2) {
            int min = nums[i], minIndex = i;
            for (int j = i; j < nums.length; j += 2) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = min;
            nums[minIndex] = tmp;
        }
        return num}