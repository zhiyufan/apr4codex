package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums, int m) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        if (m <= 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        if (res.length() < m) {
            res.insert(0, "0");
        }
        return res.toString();
    }

    
}