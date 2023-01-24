package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        if (nums.length == 0 || k == 0) {
            return avgs;
        }
        for (int i = 0; i < nums.length; i++) {
            int low = Math.max(i - k, 0);
            int high = Math.min(i + k, nums.length-1);
            int sum = 0;
            int count = 0;
            for (int j = low; j <= high; j++) {
                if (j >= 0 && j < nums.length) {
                    sum += nums[j];
                    count++;
                }
            }
            avgs[i] = count == 0 ? -1 : sum / count;
        }
        return avgs;
    }

    
}