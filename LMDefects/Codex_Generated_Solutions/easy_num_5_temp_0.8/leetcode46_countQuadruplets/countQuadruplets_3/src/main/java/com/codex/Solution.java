package com.codex;

import java.util.*;

public class Solution {
    public static int countQuadruplets(int[] nums) {
        /** Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:
         * nums[a] + nums[b] + nums[c] == nums[d], and
         * a < b < c < d
         */
        Set<String> quadruplets = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[l] == sum) {
                            quadruplets.add(nums[i] + "" + nums[j] + "" + nums[k] + "" + nums[l]);
                        }
                    }
                }
            }
        }
        return quadruplets.size();
    }


    }