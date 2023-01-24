package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) count++;
            }
        }
        return count;
    }

    public void swap(String[] nums, int i, int j) {
        String temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}