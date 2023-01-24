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
        if (i - k >= 0) {
                sum = result[i - k] * (2 * k + 1);
                sum -= nums[i - k];
            }
        if (i + k < nums.length) {
            sum += nums[i + k];
        } else {
            result[i] = -1;
        }
        
        if (result[i] != -1) {
            result[i] = sum / (2 * k + 1);
        }
    }
    return result;
}


    
}