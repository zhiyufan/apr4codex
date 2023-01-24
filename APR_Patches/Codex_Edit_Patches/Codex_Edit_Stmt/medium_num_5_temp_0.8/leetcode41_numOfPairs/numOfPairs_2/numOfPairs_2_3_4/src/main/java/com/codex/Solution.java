package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[i].compareTo(nums[j]) > 0) {
                        if ((nums[i] + nums[j]).equals(target)) {
                            count++;
                        }
                    } else {
                        if ((nums[j] + nums[i]).equals(target)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count/2;
    }

    
}