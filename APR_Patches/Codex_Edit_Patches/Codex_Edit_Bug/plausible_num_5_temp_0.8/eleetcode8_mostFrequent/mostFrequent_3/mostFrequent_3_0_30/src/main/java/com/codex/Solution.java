package com.codex;

import java.util.*;

public class Solution {
public static int mostFrequent(int[] nums, int key) {

    int maxCount = 0;
    int maxNum = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == key) {
            if (nums[i + 1] != key) {
                int count = map.getOrDefault(nums[i + 1], 0) + 1;
                map.put(nums[i + 1], count);
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = nums[i + 1];  
                }
            }
        } else {
            if (nums[i + 1] == key) {
                int count = map.getOrDefault(nums[i], 0) + 1;
                map.put(nums[i], count);
                if (count > maxCount) {
                    maxCount = count;
                    maxNum = nums[i];  
                }
            }
        }
    }
    return maxNum;
}

    
}