package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        if (nums.length == 0 || k == 0) {
            return avgs;
        }
        for (int i = 0; i < nums.length; i++) {
            int low = i - k;
            int high = i + k;
            int sum = 0;
            int count = 0;
            int count = nums.length;
            if (i - k < 0 || i + k >= nums.length) {
                count = nums.length;
            } else {
                count = 2 * k + 1;
            }
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