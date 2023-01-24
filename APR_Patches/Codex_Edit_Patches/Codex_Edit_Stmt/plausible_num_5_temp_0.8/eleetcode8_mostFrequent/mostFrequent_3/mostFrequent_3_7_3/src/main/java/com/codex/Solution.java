package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] == key && nums[i + 1] != key) {
                int count = map.getOrDefault(nums[i], 0);
                map.put(nums[i], count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i];
                }
            }
        }

        return maxNum;
    }

    
}