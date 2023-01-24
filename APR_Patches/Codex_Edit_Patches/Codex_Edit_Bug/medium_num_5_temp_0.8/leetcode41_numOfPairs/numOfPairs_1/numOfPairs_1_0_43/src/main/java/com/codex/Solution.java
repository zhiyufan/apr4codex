package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int num_i = Integer.parseInt(nums[i]);
                int num_j = Integer.parseInt(nums[j]);
                if ((num_i + num_j) == Integer.parseInt(target)){
                    count++;
                }
            }
        }
        return count;
    }

    
}