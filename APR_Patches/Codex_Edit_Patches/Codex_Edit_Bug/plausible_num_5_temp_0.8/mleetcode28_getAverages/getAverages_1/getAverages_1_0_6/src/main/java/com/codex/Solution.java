package com.codex;

import java.util.*;

public class Solution {
    public static double[] getAverages(int[] nums, int k) {
        

        double[] avgs = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            double sum = 0;
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