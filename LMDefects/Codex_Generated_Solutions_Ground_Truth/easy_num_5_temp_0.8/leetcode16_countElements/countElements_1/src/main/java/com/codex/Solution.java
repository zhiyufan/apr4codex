package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        /** Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.
         */
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] < nums[i] && nums[i] < nums[nums.length-1]) {
                    count++;
                }
        }
        return count;
    }

    }
