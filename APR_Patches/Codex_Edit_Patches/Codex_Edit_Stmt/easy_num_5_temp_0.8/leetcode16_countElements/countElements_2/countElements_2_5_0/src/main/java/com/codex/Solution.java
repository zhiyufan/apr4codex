package com.codex;

import java.util.*;

public class Solution {
//bad
    public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

//bad
     public static int countElements(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                count += 1;
            } else {
                set.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
      }
}