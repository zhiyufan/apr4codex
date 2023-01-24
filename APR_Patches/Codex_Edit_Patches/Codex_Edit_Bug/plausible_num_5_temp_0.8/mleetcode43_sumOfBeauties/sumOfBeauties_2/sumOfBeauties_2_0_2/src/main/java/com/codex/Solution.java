package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        int sum = 0;
        if (nums.length == 1) return 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[0] < nums[1]) {
                sum += 2;
            }
            if (i == nums.length - 1 && nums[nums.length - 1] < nums[nums.length - 2]) {
                sum += 2;
            }
            if (i > 0 && i < nums.length - 1 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                sum++;
            }
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                sum++;
            }
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum++;
            }
            if (nums[i] < nums[i - 1] && nums[i] > nums[i + 1]) {
                sum++;
            }
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                sum++;
            }

        }
        return sum;

    }
}