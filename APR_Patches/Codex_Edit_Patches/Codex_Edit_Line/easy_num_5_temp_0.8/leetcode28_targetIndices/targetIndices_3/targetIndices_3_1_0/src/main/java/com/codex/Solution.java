package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

public static int[] getLongestSubarray(int[] nums, int[] indices) {
        int max = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < indices.length - 1; i++) {
            if (indices[i + 1] - indices[i] > max) {
                max = indices[i + 1] - indices[i];
                start = indices[i];
                end = indices[i + 1];
            }
        }
        return Arrays.copyOfRange(nums, start, end + 1);
    }
    
}