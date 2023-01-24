package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] avgs = new int[nums.length - 2 * k];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            avgs[j] = sum / (2 * k + 1);
            j++;
        }
        return avgs;
    }

    
}