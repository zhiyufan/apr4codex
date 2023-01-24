package com.codex;

import java.util.*;

public class Solution {
/*
JavaScript function to display the number of pairs in the array that sum up to a given number
*/


    public static int numOfPairs(String[] nums, String target) {
        

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}