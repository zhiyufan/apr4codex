package com.codex;

import java.util.*;

public class Solution {
// This program is a function to find the number of pairs in an array that equal a target number    

    public static int numOfPairs(String[] nums, String target) {
        
                int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        count++;
                    }
                }
            }
        }
        return count/2;
    }

    
}