package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
                if (map.get(nums[i + 1]) > maxCount) {
                    maxCount = map.get(nums[i + 1]);
                    maxNum = nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    
}