package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], true);
            } else {
                map.put(nums[i], false);
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