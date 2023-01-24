package com.codex;

import java.util.*;

public class Solution {
 public static int sumOfBeauties(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        int result = 0;
        while (start < end && nums[start] == nums[start + 1]) {
            start++;
        }
        while (start < end && nums[end] == nums[end - 1]) {
            end--;
        }
        int last = nums[start];
        for (int i = start + 1; i < end; i++) {
            if (nums[i] != last) {
                if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                    result += 2;
                } else if (nums[i] > nums[i - 1] || nums[i] > nums[i + 1]) {
                    result += 1;
                }
                last = nums[i];
            }
        }
        if (nums[end] != last) {
            if (nums[end] > nums[end - 1]) {
                result += 1;
            }
            nowmax = Math.max(nums[nums.length - 1 - i], nowmax);
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (left[i] == 1 && right[i] == 1) {
                res[i] = 2;
            } else if (left[i] == 1 || right[i] == 1) {
                res[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < res.length - 1; i++) {
            sum += res[i];
        }
        return sum;
    }

    
}