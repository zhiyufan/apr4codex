package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                sum = 0;
                for (int j = i - k; j <= i + k; j++) {
                    sum += nums[j];
                }
                result[i] = sum / (2 * k + 1);
            } else if (i > 0) {
                sum = sum * (2 * k + 1) - nums[i - 1] + nums[i + k];
                result[i] = sum / (2 * k + 1);
            } else {
                result[i] = -1;
            }
        }
        return result;
    }
}