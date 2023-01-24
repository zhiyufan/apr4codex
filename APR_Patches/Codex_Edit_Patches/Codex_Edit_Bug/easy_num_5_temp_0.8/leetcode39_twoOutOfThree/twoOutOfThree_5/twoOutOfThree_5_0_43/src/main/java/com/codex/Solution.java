package com.codex;

import java.util.*;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }

            map.put(target - nums[i], i);
        }
        for (int n: nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        for (int n: nums3) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }
        
        return new ArrayList<>(set2);
    }
    
    
}