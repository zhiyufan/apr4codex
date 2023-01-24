package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
                int count = 0; int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        count++;
                        num++;
                    }
                }
            }
            if (num == 2) {
                break;
            }
        }
        return count/2; 
    }

    
}