package com.codex;

import java.util.*;

public class Solution {
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

        int[] nums = {5, 1, 2, 4, 3, 4};
        System.out.println(countHillValley(nums));

        int[] nums1 = {4, 2, 1, 2, 3};
        System.out.println(countHillValley(nums1));

        int[] nums2 = {3,3,2,2,3};
        System.out.println(countHillValley(nums2));

        int[] nums3 = {1, 2, 3, 2, 1};
        System.out.println(countHillValley(nums3));
                count++;
            }
        }
        return count;
    }
}