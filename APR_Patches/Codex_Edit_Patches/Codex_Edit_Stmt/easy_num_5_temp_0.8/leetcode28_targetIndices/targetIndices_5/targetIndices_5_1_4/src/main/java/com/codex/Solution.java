package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        // Given nums = [2, 7, 11, 15], target = 9
// Because nums[0] + nums[1] = 2 + 7 = 9
// return [0, 1]

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    
}