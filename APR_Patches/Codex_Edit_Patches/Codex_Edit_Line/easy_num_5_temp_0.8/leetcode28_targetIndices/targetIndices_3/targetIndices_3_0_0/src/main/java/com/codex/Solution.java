package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=1) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

    
}