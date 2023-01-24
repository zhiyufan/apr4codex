package com.codex;

import java.util.*;

public class Solution {
    public static  targetIndices(int[] nums, int target) {
        

        result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    
}