package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] averages = new int[nums.length];
        for (int x = 0; x < nums.length; x++) {
            int sum = 0;
            for (int y = x - k; y <= x + k; y++) {
                if (y < 0 || y >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[i] = sum / (2 * k + 1);
        }
        return avgs;
    }

    
}