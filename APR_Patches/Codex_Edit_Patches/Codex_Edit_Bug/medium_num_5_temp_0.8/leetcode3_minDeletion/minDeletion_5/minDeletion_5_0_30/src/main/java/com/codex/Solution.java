package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        for (int i = 0; i< length; i++) {
            if(nums[i] % 2 == 0) {
                if((i == (length - 1)) || (nums[i + 1] % 2 != 0)) {
                    count++;
                }
            } else {
                if((i == (length - 1)) || (nums[i + 1] % 2 == 0)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}