package com.codex;

import java.util.*;

public class Solution {
    // Given a string array representing binary numbers, find the different binary string.
    // For example, given {“10”, “0001”, “111001”, “1”, “0”}, return “0101”.
    // {“10”, “0001”, “111001”, “1”, “0”}
    // i = 0, x = 0
    // i = 1, x = 1 ^ 0 ^ 0 ^ 1 ^ 0 = 0
    // i = 2, x = 0 ^ 0 ^ 1 ^ 1 ^ 0 = 0
    // i = 3, x = 0 ^ 0 ^ 1 ^ 0 ^ 0 = 1
    // i = 4, x = 0 ^ 1 ^ 1 ^ 0 ^ 0 = 1
    // i = 5, x = 1 ^ 0 ^ 1 ^ 1 ^ 0 = 1
    // i = 6, x = 0 ^ 1 ^ 0 ^ 1 ^ 0 = 1
    // i = 7, x = 1 ^ 0 ^ 0 ^ 1 ^ 0 = 0
    // res = "0101100"
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
        return res.toString();
    }

    
}