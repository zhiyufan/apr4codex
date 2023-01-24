package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] avgs = new int[nums.length - k];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i - k; j <= i + k; j++) {
                if (j < 0 || j >= nums.length) {
                    continue;
                }
                sum += nums[j];
            }
            if (i >= k) {
                avgs[i-k] = sum / (2 * k + 1);
                sum -= nums[i-k];
            }
        }
        return avgs;
    }

    
}