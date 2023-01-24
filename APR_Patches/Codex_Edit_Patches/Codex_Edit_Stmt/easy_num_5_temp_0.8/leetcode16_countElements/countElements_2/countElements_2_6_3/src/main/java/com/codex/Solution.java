package com.codex;

import java.util.*;

public class Solution {
public static int countElements(int[] nums) {

    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            map.put(nums[i], map.get(nums[i]) + 1);
        } else {
            map.put(nums[i], 1);
        }
    }
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i] + 1)) {
            count += 1;
        }
    }
    return count;
}

/*
Runtime: 1 ms, faster than 99.68% of Java online submissions for Counting Elements.
Memory Usage: 38.8 MB, less than 100.00% of Java online submissions for Counting Elements.
 */
        
}