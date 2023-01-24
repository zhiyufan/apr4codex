package com.codex;

import java.util.*;

public class Solution {
    public static int sumOfBeauties(int[] nums) {


        int sum = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            int curr = nums[i];

            boolean isAsc = true;
            for (int k = i; k < nums.length - 1; k++) {
                if (curr > nums[k]) isAsc = false;
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