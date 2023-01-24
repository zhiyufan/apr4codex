package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || nums.length < k) return new int[0];

        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 || i + k >= nums.length) {
                result[i] = -1;
            } else {
                sum = result[i - k] * (2 * k + 1);
                sum -= nums[i - k - 1];
                sum += nums[i + k - 1];
                result[i] = sum / k;
            }
        }
        return result;
    }
}