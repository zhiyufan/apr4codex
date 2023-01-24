package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {    
        int[] avgs = new int[nums.length - k + 1];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) {
                sum -= nums[i - k];
            }
            avgs[i - k + 1] = sum / k;
        }
        return avgs;
    }

    
}