package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> res = new ArrayList<>();
        int lastIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && lastIndex != i) {
                res.add(i);
                lastIndex = i;
            }
        }
        return res;
    }

    
}