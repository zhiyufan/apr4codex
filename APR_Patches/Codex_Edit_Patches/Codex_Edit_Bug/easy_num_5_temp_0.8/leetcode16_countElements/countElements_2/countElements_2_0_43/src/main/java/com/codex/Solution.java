package com.codex;

import java.util.*;

public class Solution {
    public static int findNumbers(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int length = 0;
            while(nums[i] != 0) {
                nums[i] = nums[i] / 10;
                length += 1;
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