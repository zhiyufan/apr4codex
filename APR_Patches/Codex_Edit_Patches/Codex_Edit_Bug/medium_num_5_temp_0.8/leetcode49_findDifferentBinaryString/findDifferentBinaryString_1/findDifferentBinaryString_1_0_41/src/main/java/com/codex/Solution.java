package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums, (a, b) -> (a.length() - b.length()));
        for (int i = 0; i < nums.length - 1; i++) {
            String s = nums[i];
            String t = nums[i + 1];
            int j = 1;
            while (j < Math.min(s.length(), t.length())) {
                if (s.charAt(j) != t.charAt(j)) {
                    return insert(s, j, s.charAt(0) == '0' ? '1' : '0');
                }
                j++;
            }
            if (s.charAt(0) == '1') {
                return insert(s, Math.min(s.length(), t.length()) - 1, '0');
            } else {
                return insert(s, Math.min(s.length(), t.length()), '1');
            }
        }
        return nums[nums.length - 1];
    }

    private String insert(String s, int index, char c) {
        if (index == s.length()) {
            return s + c;
        } else {
            return s.substring(0, index) + c + s.substring(index);
        }
    }
}
}