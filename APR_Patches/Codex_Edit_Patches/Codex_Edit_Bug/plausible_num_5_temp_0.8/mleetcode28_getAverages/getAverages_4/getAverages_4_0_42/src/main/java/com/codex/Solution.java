package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length];
        int sum = 0, size = 2 * k + 1;
        for (int i = 0; i < nums.length; i++) {
            if (i < k || i + k >= nums.length) {
                result[i] = -1;
            } else if (result[i - k] == 0) {
                sum = 0;
                for (int j = i; j < size; j++) {
                    sum += nums[i - k + j];
                } 
                result[i] = sum / size;
            } else {
                sum = result[i - k] * size;
                sum -= nums[i - k];
                sum += nums[i + k];
                result[i] = sum / size;
            }
        }
        return result;
    }

    
}