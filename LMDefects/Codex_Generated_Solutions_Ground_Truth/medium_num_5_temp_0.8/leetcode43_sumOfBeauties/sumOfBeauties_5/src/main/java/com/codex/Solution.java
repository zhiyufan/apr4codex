package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {
        /** You are given a 0-indexed integer array nums. For each index i (1 <= i <= nums.length - 2) the beauty of nums[i] equals:
         * 2, if nums[j] < nums[i] < nums[k], for all 0 <= j < i and for all i < k <= nums.length - 1.
         * 1, if nums[i - 1] < nums[i] < nums[i + 1], and the previous condition is not satisfied.
         * 0, if none of the previous conditions holds.
         * Return the sum of beauty of all nums[i] where 1 <= i <= nums.length - 2.
         */

        int sum = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            int curr = nums[i];

            boolean condition1 = true;
            boolean condition2 = true;
            for (int j = 0; j < i; j++) {
                if (nums[j] > curr) {
                    condition1 = false;
                    break;
                }
            }
            for (int k = i; k < nums.length - 1; k++) {
                if (nums[k] < curr) {
                    condition1 = false;
                    break;
                }
            }

            if (nums[i - 1] > curr || nums[i + 1] < curr) {
                condition2 = false;
            }

            if (condition1) {
                sum += 2;
            } else if (condition2) {
                sum += 1;
            }
        }

        return sum;

    }
}