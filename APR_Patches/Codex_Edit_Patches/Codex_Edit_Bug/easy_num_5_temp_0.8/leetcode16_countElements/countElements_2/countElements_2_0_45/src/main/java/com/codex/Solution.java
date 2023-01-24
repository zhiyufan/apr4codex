package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) { // hashMap solution 
        
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int each : nums) {
            if(map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else { map.put(each, 1);
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