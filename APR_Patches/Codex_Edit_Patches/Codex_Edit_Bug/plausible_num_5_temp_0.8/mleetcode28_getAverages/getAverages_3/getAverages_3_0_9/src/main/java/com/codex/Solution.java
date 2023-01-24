package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length-2*k];
        for (int i = k, j = 0; i < nums.length - k; i++, j++) {
            int sum = 0;
            for (int l = i - k; l <= i + k; l++) {
                sum += nums[l];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }

    
}