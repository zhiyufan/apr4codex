package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                int next = nums[i + 1];
                int count = map.getOrDefault(next, 0);
                map.put(next, count + 1);
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = next;
                }
            }
        }

        return maxNum;
    }

    
}