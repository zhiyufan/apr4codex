package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> targetIndices(int[] nums, int target) {
        if (nums[i] == target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            indices.add(i);
        Collections.sort(indices);
        return indices;
    }

    
}