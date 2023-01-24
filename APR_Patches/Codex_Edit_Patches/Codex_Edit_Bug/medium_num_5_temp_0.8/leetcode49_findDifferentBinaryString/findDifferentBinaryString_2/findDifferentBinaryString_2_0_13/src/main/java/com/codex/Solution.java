package com.codex;

import java.util.*;

public class Solution {
    public static List<String> findBinaryString(List<String> nums) {
        
        if (nums == null || nums.size() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.get(0).length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.add(x);
        }
        return res.toString();
    }
}