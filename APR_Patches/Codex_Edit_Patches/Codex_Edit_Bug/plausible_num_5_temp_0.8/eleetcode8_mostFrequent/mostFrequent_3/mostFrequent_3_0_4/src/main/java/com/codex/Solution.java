package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {

        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key && i != nums.length - 1) {
                int count = map.getOrDefault(nums[i + 1], 0);//check the value
                map.put(nums[i + 1], count + 1);//map the value to count
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    
}