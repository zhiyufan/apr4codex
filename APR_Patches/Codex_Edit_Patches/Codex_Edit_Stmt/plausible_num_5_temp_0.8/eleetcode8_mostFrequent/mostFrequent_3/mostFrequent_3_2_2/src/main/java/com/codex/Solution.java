package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int next = i + 1;
                int count = map.getOrDefault(nums[next], 0);
                map.put(nums[next], count + 1);

                if (count + 1 > maxCount) {
                    maxCount++;
                    maxNum = nums[next];
                }
            }
        }

        return maxNum;
    }

    
}