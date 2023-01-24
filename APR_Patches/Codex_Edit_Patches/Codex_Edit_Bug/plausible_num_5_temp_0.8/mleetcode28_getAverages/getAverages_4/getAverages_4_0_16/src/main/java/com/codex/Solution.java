package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
    
    if (nums == null || nums.length <= 1) return nums;
    int[] result = new int[nums.length - k + 1];
    int sum = 0;
    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }
    for (int i = 0, j = 0; j < nums.length; i++, j++) {
        if (i == 0) {
            result[i] = sum / k;
        } else {
            sum -= nums[i - 1];
            if (j < nums.length - 1) {
                sum += nums[j + 1];
            }
            result[i] = sum / k;
        }
    }
    return result;
}
}