package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] + 1))
                count++;
        }
        return count;
    }

    
}