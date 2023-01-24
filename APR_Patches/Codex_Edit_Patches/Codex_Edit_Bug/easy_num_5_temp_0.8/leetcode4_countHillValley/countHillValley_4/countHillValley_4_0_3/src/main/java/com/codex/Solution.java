package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        

        	if(nums[i] == nums[i - 1]){
        		continue;
        	}
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
            if(nums[i] == nums[i + 1]){
        		continue;
        	}
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }


    
    
}