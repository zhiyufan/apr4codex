package com.codex;

import java.util.*;

public class Solution {
    public static int countHillValley(int[] nums) {
        
        if (nums == null || nums.length < 3) {
            return 0;
        }
        int result = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) ||
                    (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])) {
                result++;
            }
        }
        return result;
    }




        public static String[] stringCombinations(String input) {
        // Assume input is not null, but could be empty
        String[] result = new String[input.length() * (input.length() + 1) / 2];
        // Assume input contains only lower case letters
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                result[index++] = input.substring(i, j);
            }
        }
        return result;
    }
    
}