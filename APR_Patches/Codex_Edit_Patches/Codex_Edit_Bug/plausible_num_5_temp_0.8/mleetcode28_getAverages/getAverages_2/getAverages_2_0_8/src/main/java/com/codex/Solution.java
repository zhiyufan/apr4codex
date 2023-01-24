package com.codex;

import java.util.*;

public class Solution {
    /**
     * Given an array of numbers, give the average of all numbers within k distance to the index
     * Example:
     *         1 2 3 4 5
     * index:  0 1 2 3 4
     * k = 2
     * Output: [2, 3, 3, 3]
     * @param nums
     * @param k
     * @return
     */
    public static int[] getAverages(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i <= nums.length - 1; i++) {
            int low = i - k;
            int high = i + k - 1;
            int count = 0;
            int sum = 0;
            for (int j = low; j <= high; j++) {
                if (j >= 0 && j < nums.length) {
                    sum += nums[j];
                    count++;
                }
            }
            result[i] = count == 0 ? -1 : sum / count;
        }
        return result;
    }

    
}