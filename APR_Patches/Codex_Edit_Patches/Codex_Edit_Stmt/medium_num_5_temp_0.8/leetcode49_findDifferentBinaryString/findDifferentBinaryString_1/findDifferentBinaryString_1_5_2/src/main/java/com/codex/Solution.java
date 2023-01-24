package com.codex;

import java.util.*;

public class Solution {
    
    // 5.9
    public static String findDifferentBinaryString(String[] nums) {
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i].equals("0" + nums[i + 1])) {
                return "1" + nums[i];
            } else if (i == nums.length - 1 && nums[i].equals(nums[i - 1] + "0")) {
                return nums[i] + "1";
            } else if (i != 0 && nums[i].equals(nums[i - 1] + "0") && nums[i].equals("0" + nums[i + 1])) {
                return nums[i] + "1";
            }
        }
        return "";
    }

    // 5.51
    public static int findHeight(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }

        if (count == s.length()) {
            return s.length();
        }
        if (count == 0) {
            return k + 1;
        }

        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') {
                int j = i;
                while (j < s.length() && s.charAt(j) == '0') {
                    j++;
                }
                int cur = Math.min(i, k) + Math.min(s.length() - 1 - j + 1, k) + 1 + findHeight(s.substring(i, j), k);
                max = Math.max(max, cur);
                i = j;
            } else {
                i++;
            }
        }
        return max;
    }
}