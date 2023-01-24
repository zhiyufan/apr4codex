package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target, int start) {
        

        List<Integer> result = new ArrayList<>();
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    
}