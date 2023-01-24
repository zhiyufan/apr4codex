package com.codex;

import java.util.*;

public class Solution {
public static int[] maxSubsequence(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || nums.length < k) {
            return new int[] {};
        }
        int[] result = new int[k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            result[i] = nums[i];
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            if (sum > max) {
                max = sum;
                for (int j = i - k + 1; j <= i; j++) {
                    result[j - i + k - 1] = nums[j];
                }
            }
        }
        return result;
    }
}