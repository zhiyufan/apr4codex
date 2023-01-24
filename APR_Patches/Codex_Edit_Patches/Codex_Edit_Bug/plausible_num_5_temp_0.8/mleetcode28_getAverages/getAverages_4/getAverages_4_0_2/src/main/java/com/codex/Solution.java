package com.codex;

import java.util.*;

public class Solution {
public static int[] getAverages(int[] nums, int k) {
        

    int[] result = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < k; i++) {
        sum += nums[i];
    }
    result[k - 1] = sum / k;
    for (int i = 0; i < nums.length; i++) {
        if (i - k < 0 || i + k >= nums.length) {
            result[i] = -1;
        } else if (i >= k) {
            sum = result[i - k];
            sum -= nums[i - k];
            sum += nums[i + k];
            result[i] = sum / k;
        } else {
            sum = 0;
            for (int j = i - k; j <= i + k; j++) {
                sum += nums[j];
            }
            result[i] = sum / (2 * k + 1);
        }
    }

    return result;
}
}