package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - 2 * k];
        int sum = 0;
        int start = 0;
        for (int i = start; i < start + k; i++) {
            sum += nums[i];
        }
        for (int i = start; i < start + k; i++) {
            result[i - start] = sum / k;
        }
        start++;
        for (int i = start; i < nums.length - k; i++) {
            sum = sum - nums[i - k - 1] + nums[i + k];
            result[i - k] = sum / k;
        }
        return result;
    }

    
}