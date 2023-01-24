package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        String s = "";
        for (int i = 0; i < nums[0].length(); i++) {
            int ones = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j].charAt(i) == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}