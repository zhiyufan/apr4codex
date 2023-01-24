package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length];
        for (int i = k; i < nums.length - k; i++) {
            int sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            avgs[i] = sum / (2*k + 1);
        }
        return avgs;
    }
public static int[] getAverages(int[] nums, int k) {
        
        int[] avgs = new int[nums.length - 2*k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int j = 0;
        for (int i = k; i < nums.length - k; i++) {
            sum += nums[i];
            avgs[j++] = sum / (2*k + 1);
            sum -= nums[i - k];
        }
        return avgs;
    }


    
}