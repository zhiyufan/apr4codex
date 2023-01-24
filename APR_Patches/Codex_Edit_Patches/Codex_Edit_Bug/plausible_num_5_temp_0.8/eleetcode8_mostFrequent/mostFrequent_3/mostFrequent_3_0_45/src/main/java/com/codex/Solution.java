package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                int count = map.getOrDefault(i + 1, 0);
                map.put(i + 1, count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = i + 1;
                }
            }
        }

        return maxNum;
    }

    
}