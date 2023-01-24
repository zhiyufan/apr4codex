package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int mostFrequent(int[] nums, int key) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int max = 0;
        int maxCount = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            } 
            if (map.get(nums[i]) > maxCount) {
                max = nums[i];
                maxCount = map.get(nums[i]);
            }
        }
        return maxTarget;
    }

    
}