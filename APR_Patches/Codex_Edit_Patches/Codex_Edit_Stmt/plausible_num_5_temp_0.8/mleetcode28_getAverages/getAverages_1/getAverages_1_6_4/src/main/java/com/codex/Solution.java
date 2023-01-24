package com.codex;

import java.util.*;

public class Solution {
    private static final int[] SHORT_SAMPLE = new int[] {1, 5, 2, 6, 9, 1, 2, 6, 9, 5};
    private static final int[] LONG_SAMPLE = new
            int[] {3, 1, 0, -2, 4, 2, 1, 2, 6, 9, 5, 0, -7, 6, 5, -9};
    public static int[] getAverages(int[] nums, int k) {
        

        int[] avgs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[i] = sum / (2 * k + 1);
        }
        return avgs;
    }

    
}