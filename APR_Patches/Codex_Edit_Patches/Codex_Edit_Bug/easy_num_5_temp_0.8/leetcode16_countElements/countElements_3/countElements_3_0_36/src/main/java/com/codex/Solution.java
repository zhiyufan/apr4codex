package com.codex;

import java.util.*;

public class Solution {
// COUNTING ELEMENTS
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + 1 < nums.length && nums[i] == nums[nums[i]+1]) {
                count++;
            }
        }
        return count;
    }

    
}