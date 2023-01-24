package com.codex;

import java.util.*;

public class Solution {
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
        int temp = nums[i];
        if(map.containsKey(temp + 1)) {
            if(map.get(temp) > 1) {
                map.put(temp, map.get(temp) - 1);
                count += map.get(temp);
            } else {
                count += 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

    
}