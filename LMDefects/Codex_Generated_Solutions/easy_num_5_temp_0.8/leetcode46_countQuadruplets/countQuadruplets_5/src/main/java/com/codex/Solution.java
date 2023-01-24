package com.codex;

import java.util.*;

public class Solution {
    public static int countQuadruplets(int[] nums) {
        /** Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:
         * nums[a] + nums[b] + nums[c] == nums[d], and
         * a < b < c < d
         */
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == 0) {
                        count++;
                        l++;
                        r--;
                    } else if (sum > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return count;
    }

    }