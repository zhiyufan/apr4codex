package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxCount = 1;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length - 1; i++) {
            int count = map.getOrDefault(nums[i], 0);
            if(nums[i] == key) {
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i + 1], count + 1);
            }
            
            if (count + 1 > maxCount) {
                maxCount = count + 1;
                maxNum = nums[i + 1];
            }
        }

        return maxNum;
    }

    
}