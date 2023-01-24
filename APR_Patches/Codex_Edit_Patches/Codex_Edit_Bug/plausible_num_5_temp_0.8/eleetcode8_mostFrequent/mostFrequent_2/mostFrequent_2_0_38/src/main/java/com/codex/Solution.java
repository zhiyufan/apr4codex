package com.codex;

import java.util.*;

public class Solution {
    /**
     * Given an unsorted array, find the most frequent element in it.
     * Example 1:
     * Input: [1, 3, 1, 3, 2, 1]
     * Output: 1
     * @param nums
     * @param key
     * @return
     */
    public static int mostFrequent(int[] nums, int key) {
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num == key) 
                count = 0;
            else 
                count++;
            
            if (map.containsKey(num)) 
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