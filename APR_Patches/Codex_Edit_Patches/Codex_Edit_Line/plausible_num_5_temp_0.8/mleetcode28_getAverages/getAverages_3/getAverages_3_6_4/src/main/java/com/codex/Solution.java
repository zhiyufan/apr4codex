package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] averages = new int[nums.length];
        for (int i = k; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            averages[i] = sum / (2*k + 1);
        }
        return averages;
    }

    
}