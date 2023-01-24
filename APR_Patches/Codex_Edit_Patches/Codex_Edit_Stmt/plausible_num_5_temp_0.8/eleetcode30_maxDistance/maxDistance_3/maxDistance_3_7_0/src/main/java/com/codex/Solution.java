package com.codex;

import java.util.*;

public class Solution {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) == i) {
                map.remove(nums[i]);
            } else {
                max = Math.max(max, i - map.get(nums[i]));
            }
        }
        return max;
    }

    
}