package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

            int left = i - k < 0 ? 0 : i - k;
            int right = i + k > nums.length - 1 ? nums.length - 1 : i + k;
        double[] avgs = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = left; j <= right; j++) {
                sum += nums[j];
            }
            avgs[i] = sum / (2 * k + 1);
        }
        return avgs;
    }

    
}