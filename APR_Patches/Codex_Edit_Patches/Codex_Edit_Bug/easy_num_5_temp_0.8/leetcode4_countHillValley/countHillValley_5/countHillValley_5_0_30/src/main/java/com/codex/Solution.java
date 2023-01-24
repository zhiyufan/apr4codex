package com.codex;

import java.util.*;

public class Solution {
    //Brute force
    public static int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                count++;
            }

            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    //Optimized

    public static int countHillValley(int[] nums) {
        int count = 0;
        int lastState = 0;
        if (nums.length < 3) {
            return 0;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            int current = nums[i];
            int prev = nums[i - 1];
            int next = nums[i + 1];

            if (current > prev && current > next) {
                if (lastState != 1) {
                    count++;
                }

                lastState = 1;
            }

            if (current < prev && current < next) {
                if (lastState != -1) {
                    count++;
                }

                lastState = -1;
            }
        }
        return count;
    }
}