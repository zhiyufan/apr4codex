package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        

        
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
                if (nums[i] == nums[i+1]) {
                    count++;
                }
            } else {
                if (nums[i] != nums[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }

    
}