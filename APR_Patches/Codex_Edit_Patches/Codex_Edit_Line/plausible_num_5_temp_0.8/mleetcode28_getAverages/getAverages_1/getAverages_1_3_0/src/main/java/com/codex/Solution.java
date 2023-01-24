package com.codex;

import java.util.*;

public class Solution {
    /**
     * Calculates the averages of the successive k elements
     *
     * @param nums   array of integers
     * @param k      number of successive elements to calculate average
     * @return       array of averages
     */
    public static int[] getAverages(int[] nums, int k) {
        

        int[] avgs = new int[nums.length - 2 * k];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i - k + 1; j < nums.length && j <= i + k - 1; j++) {
                if (j < 0) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[i - k + 1] = sum / (2 * k);
        }
        return avgs;
    }
}