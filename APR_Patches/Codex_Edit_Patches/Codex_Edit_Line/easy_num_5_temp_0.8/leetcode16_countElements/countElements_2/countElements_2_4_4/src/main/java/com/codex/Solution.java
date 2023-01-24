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
            System.out.println(map);
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1) && map.containsKey(nums[i])) {
                System.out.println(nums[i] + 1);
                count += 1;
            }
        }
        return count;
    }


    // 1, 2, 2, 3, 4, 5
}