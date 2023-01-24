package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1].charAt(0) == '0') {
                return "1" + nums[i];
            } else if (nums[i].charAt(nums[i].length() - 1) == '0') {
                return nums[i + 1] + "1";
            }
        }
        return "";
    }

    
}