package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int count = 1;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num == key) {
                continue;
            }
            if (map.containsKey(num)) {
               map.put(num, map.get(num) + 1);
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