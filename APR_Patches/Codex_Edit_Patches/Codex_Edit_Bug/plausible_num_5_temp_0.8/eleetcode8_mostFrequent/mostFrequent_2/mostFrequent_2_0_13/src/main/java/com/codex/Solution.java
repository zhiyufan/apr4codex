package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int maxTarget = 0;
        int count = 0;
        int maxCount = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num == key) {
                count++; // if the target is met, count the number of occurrences
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