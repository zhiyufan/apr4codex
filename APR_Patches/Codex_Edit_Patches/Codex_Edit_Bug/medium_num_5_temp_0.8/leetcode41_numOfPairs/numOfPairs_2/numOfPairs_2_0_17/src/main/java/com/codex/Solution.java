package com.codex;

import java.util.*;

public class Solution {
    
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
        
        if (count % 2 == 0) {
            return count/2;
        } else {
            return (count/2) + 1;
        }
    }

    
}