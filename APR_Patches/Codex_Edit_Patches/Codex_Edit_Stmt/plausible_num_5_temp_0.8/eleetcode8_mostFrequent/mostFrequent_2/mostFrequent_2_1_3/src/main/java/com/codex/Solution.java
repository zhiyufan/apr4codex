package com.codex;

import java.util.*;

public class Solution {
    /**
     * @param nums: A list of integers
     * @param key: An integer
     * @return: An integer
     */
    public static int mostFrequent(int[] nums, int key) {

        int maxTarget = 0;
        
        int count = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            // key always init to be zero
            if (num == key) {
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