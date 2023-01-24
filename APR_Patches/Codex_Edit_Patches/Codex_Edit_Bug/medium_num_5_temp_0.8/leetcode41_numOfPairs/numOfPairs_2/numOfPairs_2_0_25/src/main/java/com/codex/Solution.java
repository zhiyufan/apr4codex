package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        int num = Integer.parseInt(target);
                int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (Integer.parseInt(nums[i]) + Integer.parseInt(nums[j]) == num) {
                        count++;
                    }
                }
            }
        }
        return count/2;
    }

    
}