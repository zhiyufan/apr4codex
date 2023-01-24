package com.codex;

import java.util.*;

public class Solution {
public static int[] leftBeauties(int[] nums) {
    int[] left = new int[nums.length];
    int nowmin = nums[0];
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > nowmin) {
            left[i] = 1;
        } else {
            left[i] = 0;
        }
        nowmin = Math.min(nums[i], nowmin);
    }

    return left;
}

public static int[] rightBeauties(int[] nums) {
    int[] right = new int[nums.length];
    int nowmax = nums[nums.length - 1];
    for (int i = 0; i < nums.length; i++) {
        if (nums[nums.length - 1 - i] < nowmax) {
            right[nums.length - 1 - i] = 1;
        } else {
            right[nums.length - 1 - i] = 0;
        }
        nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
    }
    return right;
}

public static int sumOfBeauties(int[] nums) {
    int[] left = leftBeauties(nums);
    int[] right = rightBeauties(nums);
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        if (left[i] == 1 && right[i] == 1) {
            res[i] = 2;
        } else if (left[i] == 1 || right[i] == 1) {
            res[i] = 1;
        } else {
            res[i] = 0;
        }
    }
    int sum = 0;
    for (int i = 0; i < res.length; i++) {
        sum += res[i];
    }
    return sum;
}
}