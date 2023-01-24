package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] nums) {
        
        int[] left = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            left[i] = map.containsKey(nums[i]) ? map.get(nums[i]) : -1;
            map.put(nums[i], i);
        }

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int distance = i - left[i];
            max = Math.max(max, distance);
        }
        return max;
    }

    
}