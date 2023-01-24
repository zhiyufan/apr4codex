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

    public static int[] getAverages(int[] nums, int k) {
        if (k <= 0) {
            return new int[0];
        }
        int[] avgs = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        avgs[0] = sum / k;
        for (int i = 1; i <= nums.length - k; i++) {
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            avgs[i] = sum / k;
        }
        return avgs;
    }
    
}