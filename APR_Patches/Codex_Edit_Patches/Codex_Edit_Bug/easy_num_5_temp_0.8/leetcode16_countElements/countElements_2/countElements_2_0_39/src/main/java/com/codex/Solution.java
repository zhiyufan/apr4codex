package com.codex;

import java.util.*;

public class Solution {
    public int majorityElement(int[] nums) {
        int major_element = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                major_element = nums[i];
                count++;
            }
            else if(major_element == nums[i]) {
                count++;
            }
            else {
               count--; 
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i] + 1)) {
                count += 1;
            }
        }
        return count;
    }

    
}