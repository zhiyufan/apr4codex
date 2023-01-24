package com.codex;

import java.util.*;

public class Solution {
public class Test {
    public static void main(String[] args) {
        String[] test = {"1110", "1110"};
        String res = findDifferentBinaryString(test);
        System.out.println(res);
    }
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
}