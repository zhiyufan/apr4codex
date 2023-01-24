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
        int[] even = new int[nums.length / 2 + 1];
        int[] odd = new int[nums.length / 2];
        for (int i = 0, j = 0, k = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[j] = nums[i];
                j++;
            } else {
                odd[k] = nums[i];
                k++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int[] result = new int[nums.length];
        for (int i = 0, j = 0, k = odd.length - 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = even[j];
                j++;
            } else {
                result[i] = odd[k];
                k--;
            }
        }
        return result;
    }

    }