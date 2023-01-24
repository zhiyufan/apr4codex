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
        if (nums == null) return null;
        for (int i=0;i<nums.length;i++) {
            if (i%2==0) {
                int min = nums[i];
                int index = i;
                for(int j=i+2;j<nums.length;j+=2) {
                    if (nums[j] < min) {
                        min = nums[j];
                        index = j;
                    }
                }
                int temp = nums[i];
                nums[i] = min;
                nums[index] = temp;
            }
            else {
                int max = nums[i];
                int index = i;
                for(int j=i+2;j<nums.length;j+=2) {
                    if (nums[j] > max) {
                        max = nums[j];
                        index = j;
                    }
                }
                int temp = nums[i];
                nums[i] = max;
                nums[index] = temp}