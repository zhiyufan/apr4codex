package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int[] avg = new int[nums.length];
        avg[0] = sum;
        for (int i = 1; i < nums.length - k + 1; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            avg[i] = sum;
        }
        for (int i = k; i < nums.length; i++) {
            avg[i] = -1;
        }
        return avg;
        
    }

    
}