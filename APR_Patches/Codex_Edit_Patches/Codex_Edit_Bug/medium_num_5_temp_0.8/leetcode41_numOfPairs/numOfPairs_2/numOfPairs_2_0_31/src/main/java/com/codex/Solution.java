package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {

                int count = 0;
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < length; j++) {
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