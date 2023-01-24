package com.codex;

import java.util.*;

public class Solution {
public static int numOfPairs(String[] nums, String target) {

    int count = 0;

    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if ((nums[i] + nums[j]).equals(target)) {
                count++;
            }
        }
    }
    return count;
}



//O(n)

    public static int numOfPairs(String[] nums, String target) {  
        Map<String, Integer> map = new HashMap<>();


        int count = 0;


            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                count += map.get(target - nums[i]);
            }
        }
        return count;
    }

    
}