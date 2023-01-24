package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        
        int[] count = new int[32];
        
        for (String num : nums) {
            int cur = 1;
            int index = num.length() - 1;
            while (index >= 0) {
                count[index] += num.charAt(index) == '1' ? cur : 0;
                index--;
                cur <<= 1;
            }
        }
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
}