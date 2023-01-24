package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] == key && nums[i - 1] != key) {
                int count = map.getOrDefault(nums[i + 1], 0);
                map.put(nums[i + 1], count + 1);
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = nums[i];
                }
            }
        }

        return maxNum;
    }

    
}