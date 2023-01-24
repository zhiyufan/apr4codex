package com.codex;

import java.util.*;

public class Solution {
    
    public static List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        Collections.sort(indices);
        return indices;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            values.put(nums[i], i);
        }
        
        int[] answer = new int[2];
        for (int i=0; i<nums.length; i++) {
            int diff = target-nums[i];
            if (values.containsKey(diff) && values.get(diff) != i) {
                answer[0] = i;
                answer[1] = values.get(diff);
            }
        }
        return answer;
    }

    
    
}