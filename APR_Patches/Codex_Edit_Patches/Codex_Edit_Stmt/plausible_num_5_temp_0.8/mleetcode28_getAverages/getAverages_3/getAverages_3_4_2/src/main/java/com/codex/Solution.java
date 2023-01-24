package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];
        double sum = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < k) {
                sum += nums[i];
                continue;
            }

            result[index++] = sum / k;
            sum += nums[i] - nums[i - k];
        }
        return result;
    }




    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        for (int i = k; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }

    
}