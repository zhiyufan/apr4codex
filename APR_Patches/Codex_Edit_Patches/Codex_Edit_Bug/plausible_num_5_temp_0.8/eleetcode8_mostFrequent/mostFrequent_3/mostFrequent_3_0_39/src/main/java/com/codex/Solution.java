package com.codex;

import java.util.*;

public class Solution {
import java.util.*;

public class Main {

    public static int mostFrequent(int[] nums) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            map.put(nums[i], count + 1);
            if (count + 1 > maxCount) {
                maxCount = count;
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static int mostFrequentFollower(int[] nums, int key) {
        
        int maxCount = 0;
        int maxNum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key && nums[i] != nums[i + 1]) {
                int count = map.getOrDefault(nums[i], 0);
                map.put(nums[i], count + 1);
                if (count + 1 >= maxCount) {
                    maxCount = count;
                    maxNum = nums[i];
                }
            }
        }

        return maxNum;
    }

    
}