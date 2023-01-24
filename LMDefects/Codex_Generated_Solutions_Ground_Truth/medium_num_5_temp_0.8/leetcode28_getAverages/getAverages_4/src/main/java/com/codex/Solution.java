package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        /** You are given a 0-indexed array nums of n integers, and an integer k.
         * The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.
         * Build and return an array avgs of length n where avgs[i] is the k-radius average for the subarray centered at index i.
         * The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.
         * For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.
         */

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 || i + k >= nums.length) {
                result[i] = -1;
            } else if (result[i - k] == 0) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else {
                sum = result[i - k] * (2 * k + 1);
                sum -= nums[i - k];
                sum += nums[i + k];
                result[i] = sum / (2 * k + 1);
            }
        }
        return result;
    }

    }