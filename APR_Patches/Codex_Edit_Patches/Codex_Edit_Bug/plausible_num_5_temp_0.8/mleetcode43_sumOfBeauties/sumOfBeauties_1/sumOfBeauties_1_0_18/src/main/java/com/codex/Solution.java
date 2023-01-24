package com.codex;

import java.util.*;

public class Solution {
    public static boolean isBeauty(int[] nums, int i) {
        int temp = nums[i];
        int left = i - 1;
        while (left >= 0) {
            if (nums[left] > temp) {
                return false;
            }
            left--;
        }
        int right = i + 1;
        while (right < nums.length) {
            if (nums[right] < temp) {
                return false;
            }
            right++;
        }
        return true;
    }

    public static int sumOfBeauties(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (isBeauty(nums, i)) {
                sum += 1;
            }
        }
        return sum;
    }

    
}