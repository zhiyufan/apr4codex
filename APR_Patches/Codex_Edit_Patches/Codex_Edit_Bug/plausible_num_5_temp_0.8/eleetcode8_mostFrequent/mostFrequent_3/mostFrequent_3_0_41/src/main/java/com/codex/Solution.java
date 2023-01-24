package com.codex;

import java.util.*;

public class Solution {
public static List<Integer> mostFrequent(int[] nums, int key) {
    
    int maxCount = 0;
    List<Integer> result = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == key && nums[i + 1] != key) {
            int count = map.getOrDefault(nums[i + 1], 0);
            map.put(nums[i + 1], count + 1);
            if (count + 1 > maxCount) {
                maxCount = count + 1;
                result.clear();
                result.add(nums[i + 1]);
            } else if (count + 1 == maxCount) {
                result.add(nums[i + 1]);
            }
        } 
    }

    return result;
}

    
}