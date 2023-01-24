package com.codex;

import java.util.*;

public class Solution {
    public static int countQuadruplets(int[] nums) {
        /** Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:
         * nums[a] + nums[b] + nums[c] == nums[d], and
         * a < b < c < d
         */
        Arrays.sort(nums);

        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == 0) {
                        result++;
                        while (k < l && nums[k] == nums[++k]) {}
                        while (k < l && nums[l] == nums[--l]) {}
                    } else if (sum < 0) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return result;
    }

    }