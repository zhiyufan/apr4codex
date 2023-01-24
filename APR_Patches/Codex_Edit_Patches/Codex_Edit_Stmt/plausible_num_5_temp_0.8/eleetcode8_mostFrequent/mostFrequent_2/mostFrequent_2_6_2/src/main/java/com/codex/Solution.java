package com.codex;

import java.util.*;

public class Solution {
    public static int mostFrequent(int[] nums, int key) {
        
        int count = 0;
        int maxCount = 0;
        int maxTarget = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else{
                map.put(num, 1);
            }
            if (map.get(num) > maxCount && num != key) {
                maxCount = map.get(num);
                maxTarget = num;
            }
        }
        return maxTarget;
    }
}