package com.codex;

import java.util.*;

public class Solution {
    public static List<Integer> targetIndices(int[] nums, int target) {
        int[] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                numbers[i] = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result.add(numbers[i]);
            }
        }
        return result;
    }

    
}