package com.codex;

import java.util.*;

public class Solution {
  public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums.length;
        String result = "";
        Set<Character> set = new HashSet<>(Arrays.asList('0', '1'));

        for (char c : nums[0].toCharArray()) {
            set.remove(c);
            result += c;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < nums[i].length(); j++) {
                if (nums[i].charAt(j) != result.charAt(j)) {
                    set.remove(nums[i].charAt(j));
                    result = result.substring(0, j) + nums[i].charAt(j) + result.substring(j + 1, result.length());
                    j = result.length();
                }
            }
        }
        return s;
    }

    
}