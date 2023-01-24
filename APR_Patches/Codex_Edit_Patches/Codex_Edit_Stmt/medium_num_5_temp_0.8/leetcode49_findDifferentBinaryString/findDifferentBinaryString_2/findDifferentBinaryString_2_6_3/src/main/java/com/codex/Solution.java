package com.codex;

import java.util.*;

public class Solution {
    String res = "";
    public static String findDifferentBinaryString(String[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        for (int i = 0; i < nums[0].length(); ++i) {
            int x = 0;
            for (String num : nums) {
                x ^= num.charAt(i) - '0';
            }
            res.append(x);
        }
    }

}