package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int m = 
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int z = 0;
            for (String num : nums) {
                z ^= num.charAt(i) - '0';
            }
            res.append(z);
        }
        return res.toString();
    }

    
}