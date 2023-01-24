package com.codex;

import java.util.*;

public class Solution {
public static int countHillValley(int[] nums) {
        
    	// corner case:
    	if (nums == null || nums.length < 3) {
            return 0; 
        }	
        int result = 0; 
        // core logic:
        // iterate through the array and count the number of times
        // where the previous number is less than the current number
        // and the next number is less than the current number
        for (int i = 1; i < nums.length - 1; i++) { // iterate through the array
            if ((nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] > nums[i + 1])) { // find the elements that could be valley or hill
                result++;
            }
        }
        return result;
    }

    
}