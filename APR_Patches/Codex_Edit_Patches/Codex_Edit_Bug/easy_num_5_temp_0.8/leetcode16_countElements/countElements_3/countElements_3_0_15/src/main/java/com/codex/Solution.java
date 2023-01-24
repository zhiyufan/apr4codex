package com.codex;

import java.util.*;

public class Solution {
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j] && nums[i] + 1 == nums[j]) {
                    count++;
                }
            }
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) { //Loop to check if the element plus 1 is in the array and add to the result
            int key = entry.getKey();
            if (count.containsKey(key + 1)) {
                result = result + entry.getValue();
            }
        }
        return result;
    }

    
}