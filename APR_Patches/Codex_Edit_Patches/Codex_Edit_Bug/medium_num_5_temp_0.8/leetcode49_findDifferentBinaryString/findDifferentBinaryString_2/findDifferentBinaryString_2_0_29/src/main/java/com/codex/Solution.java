package com.codex;

import java.util.*;

public class Solution {
    public static int findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int res = 0;
        for (int i = 0; i < 31; ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res |= (num << i);
        }
        return res;
    }

    
}