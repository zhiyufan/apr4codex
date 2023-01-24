package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 2);
            } else {
                map.put(nums[i], 1);
            }
        }
        int count = 0;
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[count] = entry.getKey();
                count++;
            }
        }
        
        return result;
    }

}
}