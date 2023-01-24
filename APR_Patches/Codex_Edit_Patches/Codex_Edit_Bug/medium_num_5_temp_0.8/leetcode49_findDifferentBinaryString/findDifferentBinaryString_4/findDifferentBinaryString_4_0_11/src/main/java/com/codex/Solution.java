package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        int[] row = new int[32];
        int[] col = new int[32];

        for (String num : nums) {
            for (int j = 0; j < 32; j++) {
                if ((num & (1 << j)) != 0) {
                    col[j] += 1;
                } else { 
                    row[j] += 1;
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