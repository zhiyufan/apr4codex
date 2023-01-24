package com.codex;

import java.util.*;

public class Solution {

// Sample code for Coding challenge.


    public static int numOfPairs(String[] nums, String target) {
        
                int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if ((nums[i] + nums[j]).equals(target)) {
                        count++;
                    }
                }
            }
        }
		//the extra condition is added to avoid overcounting.
        return count/2 - 1; 
    }

    
}