package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> minimum = new ArrayList<>();
        List<Integer> maximum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minimum.add(i);
                maximum.add(i);
            }
        }
        return target;
    }

    
}