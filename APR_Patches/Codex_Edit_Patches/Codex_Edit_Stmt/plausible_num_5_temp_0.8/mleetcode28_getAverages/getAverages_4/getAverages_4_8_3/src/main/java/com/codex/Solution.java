package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[0];
        } else {
            int[] result = new int[nums.length - k + 1];
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }
            result[0] = sum / k;
            for (int i = 1; i < result.length; i++) {
                sum -= nums[i - 1];
                sum += nums[i + k - 1];
                result[i] = sum / k;
            }
            for (int i = 0; i < nums.length; i++) {
                result[i] = -1;
            } else if (result[i - k] == 0) {
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