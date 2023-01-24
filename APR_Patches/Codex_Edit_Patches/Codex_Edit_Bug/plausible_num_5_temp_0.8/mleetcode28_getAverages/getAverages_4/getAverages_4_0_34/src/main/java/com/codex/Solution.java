package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - (2 * k)];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < k; i++) {
            result[i] = sum / (2 * i + 1);
            sum += nums[i + k];
        }
        
        for (int i = k; i < result.length - k; i++) {
            sum -= nums[i - k];
            sum += nums[i + k];
            result[i] = sum / (2 * k + 1);
        }
        
        for (int i = result.length - k; i < result.length; i++) {
            sum -= nums[i - k];
            if (i + k >= nums.length) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else {
                sum = result[i - k] * (2 * k + 1);
                sum -= nums[i - k];
                sum += nums[i + k];
                result[i] = sum / (2 * k + 1);
            }
        }
        return result;
    }

    
}