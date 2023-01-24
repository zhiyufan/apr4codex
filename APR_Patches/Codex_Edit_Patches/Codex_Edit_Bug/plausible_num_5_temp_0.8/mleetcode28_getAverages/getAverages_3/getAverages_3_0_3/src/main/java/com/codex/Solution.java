package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length - 2*k + 1];
        int j = 0;
        for (int i = k; i <= nums.length - k; i++) {
            int sum = 0;
            for (int m = i - k; m <= i + k; m++) {
                sum += nums[m];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }

    
}