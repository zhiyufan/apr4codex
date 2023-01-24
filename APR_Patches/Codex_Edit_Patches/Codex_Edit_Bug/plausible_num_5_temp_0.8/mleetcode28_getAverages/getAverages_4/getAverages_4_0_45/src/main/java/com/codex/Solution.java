package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - 2 * (k - 1)];
        int sum = 0;
        for (int i = 0; i < 2 * k - 1; i++) {
            sum += nums[i];
        }
        result[0] = sum / (2 * k - 1);
        for (int i = 1; i < result.length; i++) {
            sum = result[i - 1] * (2 * k - 1);
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
            result[i] = sum / (2 * k - 1);
        }
        return result;
    }

    
}