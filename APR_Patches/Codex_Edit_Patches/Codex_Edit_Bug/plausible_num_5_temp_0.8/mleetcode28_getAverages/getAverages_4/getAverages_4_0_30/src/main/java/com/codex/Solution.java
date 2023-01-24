package com.codex;

import java.util.*;

public class Solution {
    public static int[] getAverages(int[] nums, int k) {
        

        int[] result = new int[nums.length - 2 * k];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        result[0] = sum / k;
        for (int i = k + 1; i < nums.length - k; i++) {
            sum = sum - nums[i - k - 1] + nums[i];
            result[i - k] = sum / k;
        }
        return result;
    }
}