package com.codex;

import java.util.*;

public class Solution {
    public static int minDeletion(int[] nums) {
        

            if (nums[i] == nums[i+1]) {
                count++;
                continue;
            }
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] % 2 == 0) {
            } else {
                count++;
            }
        }
        return count;
    }

    
}