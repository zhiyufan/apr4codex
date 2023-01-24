package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, int target) {
        

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}