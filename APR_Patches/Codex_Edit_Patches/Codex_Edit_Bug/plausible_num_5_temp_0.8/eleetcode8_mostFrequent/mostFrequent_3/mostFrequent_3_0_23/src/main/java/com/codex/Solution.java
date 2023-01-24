package com.codex;

import java.util.*;

public class Solution {
    public static char mostFrequent(int[] nums, char key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i + 1] != key) {
                int count = map.getOrDefault(Character.valueOf((char) nums[i + 1]), 0);
                map.put(Character.valueOf((char) nums[i + 1]), count + 1);
                if (count + 1 > maxCount) {
                    maxCount = count + 1;
                    maxNum = (char) nums[i + 1];
                }
            }
        }

        return maxNum;
    }

    
}