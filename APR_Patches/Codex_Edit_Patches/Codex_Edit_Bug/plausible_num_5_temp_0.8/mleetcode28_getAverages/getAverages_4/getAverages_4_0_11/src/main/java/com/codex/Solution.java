package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i - k;
            int end = i + k;
            if (start >= 0 && end < nums.length) {
                sum += nums[end];
                if (start >= 1) {
                    sum -= nums[start - 1];
                } 
                result[i] = sum / (end - start + 1);
            }
        }
        return result;
    }

    
}