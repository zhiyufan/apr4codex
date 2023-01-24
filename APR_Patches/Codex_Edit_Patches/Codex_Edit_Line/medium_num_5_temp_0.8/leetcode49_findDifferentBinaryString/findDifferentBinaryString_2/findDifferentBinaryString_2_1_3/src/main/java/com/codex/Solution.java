package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                for (int j = 0; j < nums[0].length(); ++j) {
                    x ^= num.charAt(j) - '0';
                }
                res.append(x);
            } 
        return res.toString();
    }

    
}