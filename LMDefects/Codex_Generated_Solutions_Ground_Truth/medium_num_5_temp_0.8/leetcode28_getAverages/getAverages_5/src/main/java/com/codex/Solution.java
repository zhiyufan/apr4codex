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
        int len = nums.length;
        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            double sum = 0;
            int count = 0;
            int j = i - k;
            while (j <= i + k && j < len) {
                if (j >= 0) {
                    sum += nums[j];
                    count++;
                }
                j++;
            }
            if (count == k * 2 + 1) {
                ans[i] = (int) Math.floor(sum / count);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }

    }