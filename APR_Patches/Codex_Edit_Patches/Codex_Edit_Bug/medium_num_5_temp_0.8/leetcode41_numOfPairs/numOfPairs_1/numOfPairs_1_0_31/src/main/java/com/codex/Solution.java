package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        int count = 0;
        

        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if ((nums[i] + nums[j]).equals(target)) {
    }
        } else {
            count = 0;
                    count++;
                }
            }
        }
        return count;
    }
}