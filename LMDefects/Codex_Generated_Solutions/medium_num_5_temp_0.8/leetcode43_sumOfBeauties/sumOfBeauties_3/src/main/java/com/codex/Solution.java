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
        if (nums.length == 1) return 2;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1;
            } else if (nums[i] > nums[i + 1] && nums[i] < nums[i - 1]) {
                sum += 1;
            } else {
                for (int j = 0; j < i; j++) {
                    for (int k = i + 1; k < nums.length; k++) {
                        if (nums[j] < nums[i] && nums[i] < nums[k]) {
                            sum += 2;
                        }
                    }
                }
            }
        }
        return sum;
    }

    }