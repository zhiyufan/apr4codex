package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - 2 * k];
        int sum = 0, j = 0;

        for (int i = -k; i <= k; i++) {
            sum += nums[j];
        } 
        result[0] = sum / (2 * k + 1);

        for (int i = 1; i < nums.length - 2 * k; i++) {
            sum = result[i - 1] * (2 * k + 1);
            sum -= nums[i - 1];
            sum += nums[j + 2 * k + 1];
            result[i] = sum / (2 * k + 1);

            if (i == k) {
                if (k == 0) {
                    result[i] = -1;
                } else {
                    for (int m = 0; m < k; m++) {
                        result[i - m] = -1;
                    }
                }
            }
        }
        return result;
    }

    
}