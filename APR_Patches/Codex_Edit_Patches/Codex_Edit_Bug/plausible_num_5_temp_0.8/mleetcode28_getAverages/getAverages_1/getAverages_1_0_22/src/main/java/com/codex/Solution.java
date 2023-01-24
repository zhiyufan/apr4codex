package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        int[] avgs = new int[nums.length - 2 * k];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= k) {
                sum += nums[i];
            }
            avgs[i] = sum / (2 * k + 1);
        }
        return avgs;
    }

    
}