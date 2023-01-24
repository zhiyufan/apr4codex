package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int k) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == k && nums[j + 1] != k) {
                int count = map.getOrDefault(nums[j + 1], 0);
                map.put(nums[j + 1], count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    
}