package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<Integer>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                indices.add(index);
            }
        }
        Collections.sort(indices);
        return indices;
    }

    
}