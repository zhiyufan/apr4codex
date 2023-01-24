package com.codex;

import java.util.*;

public class Solution {
/**
 * Given an array of nums, there is one key in the array. Determine which is the most frequently 
 * occurs in the nums.
 * @author Kehao Wang
 * @version 2.0
 */

import java.util.HashMap;

    public static int mostFrequent(int[] nums, int key) {
        
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                count = map.get(num);
            } else if (num == key) {
                count = 0;
            } else {
                count++;
            }
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + count);
            } else {
                map.put(num, count);
            }
            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                maxTarget = num;
            }
        }
        return maxTarget;
    }

    
}