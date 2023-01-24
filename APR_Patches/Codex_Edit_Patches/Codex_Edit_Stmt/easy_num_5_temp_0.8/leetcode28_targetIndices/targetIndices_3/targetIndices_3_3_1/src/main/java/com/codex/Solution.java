package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targerIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targer) { // Noncompliant; targets.length would be correct.
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

    
}