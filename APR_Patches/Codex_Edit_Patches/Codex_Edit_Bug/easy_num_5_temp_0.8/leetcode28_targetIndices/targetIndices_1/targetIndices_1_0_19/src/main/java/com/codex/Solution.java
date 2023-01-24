package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {

        // If nums is null or empty, return empty List
        if (nums == null || nums.length == 0) {
            return new ArrayList<Integer>();
        }

        // If target is not in nums, return empty List
        if (!contains(nums, target)) {
            return new ArrayList<Integer>();
        }

        List<Integer> res = new ArrayList<>();

        // Add all occurrences of target in nums, to res
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }

        return res;
    }


    // Helper method to check if the target is contained in nums
    private static boolean contains(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }
}