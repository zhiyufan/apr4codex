package com.codex;

import java.util.*;

public class Solution {
public class BinaryString {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums[0].length(); ++i) {
            int digit = 0;
            for (String num : nums) {
                digit ^= num.charAt(i) - '0'; // XOR
            }
            res.append(digit);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(findDifferentBinaryString(new String[] {"11", "01", "10"}));
    }
}

    
}