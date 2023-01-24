package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int min = nums[0];
        int max = nums[nums.length - 1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min) {
                left[i] = 1;
            }
            min = Math.min(nums[i], min);
            if (nums[nums.length - 1 - i] < max) {
                right[nums.length - 1 - i] = 1;
            }
            max = Math.max(nums[nums.length - 1 - i], max);
        }
        for (int i = 0; i < nums.length; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[i] = 2;
            } else if (left[i] == 1 || right[i] == 1) {
                res[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}