package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
                int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        if (nums[i] != nums[j]) {
                            count++;
                        } else {
                            count += 2;
                        }
                    }
                }
            }
        }
        return count/2;
    }

    
}