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

    public static Integer highestIndex(List<Integer> indices) {
        if (indices.isEmpty()) {
            return null;
        }
        return indices.get(indices.size() - 1);
    }
}