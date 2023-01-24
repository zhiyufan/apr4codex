package com.codex;

import java.util.*;

public class Solution {
    // Returns the indices for the target
    public static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        //Collections.sort(indices);
        //return indices;

        // instead of sorting, just do a binary search
        Collections.sort(indices);
        int size = indices.size();

        // if target is greater than the last index, return the last index
        if (target > nums[indices.get(size - 1)]) {
            indices = Collections.singletonList(indices.get(size - 1));
            return indices;
        }

        // if the target is less than the first index, return the first index
        if (target < nums[indices.get(0)]) {
            indices = Collections.singletonList(indices.get(0));
            return indices;
        }

        int min = 0;
        int max = size - 1;

        // binary search
        while (min < max) {
            int mid = (min + max) / 2;
            if (nums[indices.get(mid)] == target) {
                indices = Collections.singletonList(indices.get(mid));
                break;
            } else if (nums[indices.get(mid)] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        Collections.sort(indices);
        return indices;
    }
}