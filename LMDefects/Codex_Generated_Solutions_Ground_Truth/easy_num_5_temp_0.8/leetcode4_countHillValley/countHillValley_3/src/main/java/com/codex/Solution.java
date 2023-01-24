package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        /** You are given a 0-indexed integer array nums. An index i is part of a hill in nums if the closest non-equal neighbors of i are smaller than nums[i]. Similarly, an index i is part of a valley in nums if the closest non-equal neighbors of i are larger than nums[i]. Adjacent indices i and j are part of the same hill or valley if nums[i] == nums[j].
         *  Note that for an index to be part of a hill or valley, it must have a non-equal neighbor on both the left and right of the index.
         *  Return the number of hills and valleys in nums.
         */
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        int prev=nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if ((prev < nums[i] && nums[i] > nums[i + 1]) ||
                    (prev > nums[i] && nums[i] < nums[i + 1])) {
                result++;
                prev=nums[i];
            }
        }
        return result;
    }

    }