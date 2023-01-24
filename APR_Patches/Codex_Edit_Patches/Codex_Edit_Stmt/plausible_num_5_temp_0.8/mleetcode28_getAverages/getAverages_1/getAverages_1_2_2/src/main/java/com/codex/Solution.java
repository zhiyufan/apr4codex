package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        double[] avgs = new double[nums.length];
        double sum = 0;
        int count = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            sum += nums[i];
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i + k];
            avgs[i] = sum / count;
            sum -= nums[i];
        }
        return avgs;
    }

    
}