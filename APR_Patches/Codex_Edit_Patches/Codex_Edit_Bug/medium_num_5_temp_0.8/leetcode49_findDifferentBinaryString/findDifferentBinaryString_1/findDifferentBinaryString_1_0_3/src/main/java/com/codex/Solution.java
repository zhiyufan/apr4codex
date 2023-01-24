package com.codex;

import java.util.*;

public class Solution {

    public static String findDifferentBinaryString(String[] nums) {
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && isprefix(nums[i], nums[i + 1])) {
                return "1" + nums[i];
            } else if (i == nums.length - 1 && isprefix(nums[i - 1], nums[i])) {
                return nums[i] + "1";
            } else if (i != 0 && isprefix(nums[i - 1], nums[i]) && isprefix(nums[i], nums[i + 1])) {
                return nums[i] + "1";
            }
        }
        return "";
    }

    public static boolean isprefix(String s1, String s2) {
        if (s1.length() >= s2.length())
            return false;
        return s2.startsWith(s1);
    }
}