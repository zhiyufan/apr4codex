package com.codex;

import java.util.*;

public class Solution {
import java.util.Map;
import java.util.HashMap;

// Given an array of integers and a key, determine the number that appears most frequently
// in the array given that it is next to the key. 

    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                int count = map.getOrDefault(nums[i + 1], 0);
                map.put(nums[i + 1], count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    
}