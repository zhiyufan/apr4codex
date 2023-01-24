package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i].equals("0" + nums[i + 1])) 
                return "1" + nums[i];
            
            else if (i == nums.length - 1 && nums[i].equals("1" + nums[i - 1])) 
                return nums[i] + "1";
            
            else if (i != 0 && nums[i].equals("1" + nums[i - 1]) && nums[i].equals("0" + nums[i + 1])) 
                return nums[i] + "1";
            
        }
        return "";
    }

    
}