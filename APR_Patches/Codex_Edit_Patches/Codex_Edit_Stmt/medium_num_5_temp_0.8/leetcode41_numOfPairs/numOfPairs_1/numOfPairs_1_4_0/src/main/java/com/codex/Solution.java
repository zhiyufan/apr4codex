package com.codex;

import java.util.*;

public class Solution {
    public static int numOfPairs(String[] nums, String target) {


        int count = 0;

        for (int i = 0; i < nums.length; i++) { // this could be done by first converting the string to a char array, then applying Arrays.sort(arr) 
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]).equals(target)) {
                    count++;
                }
            }
        }
        return count;
    }

    
}