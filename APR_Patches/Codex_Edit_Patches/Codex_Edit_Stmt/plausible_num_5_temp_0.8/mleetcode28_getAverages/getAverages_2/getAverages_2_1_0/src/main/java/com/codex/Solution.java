package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length - k];
        if (nums.length == 0 || k == 0) {
            return avgs;
        }
        for (int i = 0; i < nums.length - k; i++) {
            int low = i;
            int high = i + 2 * k;
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