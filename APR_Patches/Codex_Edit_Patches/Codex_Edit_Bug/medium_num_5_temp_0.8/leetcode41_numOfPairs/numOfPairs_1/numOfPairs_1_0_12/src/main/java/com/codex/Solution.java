package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        int length = nums.length;

        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}