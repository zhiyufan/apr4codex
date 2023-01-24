package com.codex;

import java.util.*;

public class Solution {
/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there're duplicates in arr, count them seperately.
 */
    public static int countElements(int[] nums) {
        
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
}