package com.codex;

import java.util.*;

public class Solution {
 public static int minDeletion(int[] nums) {
      
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }

    
    
}