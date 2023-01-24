package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if (nums == null || nums.length == 0) {
            return "";
        }
        int num = Integer.parseInt(nums[0], 2);
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        for (int i = 0; i < nums.length; i++) {
            int currNum = Integer.parseInt(nums[i], 2);
            int diff = currNum ^ num;
            for (int j = 0; j < 32; j++) {
                if (((diff >> j) & 1) == 1) {
                    row[i] += 1;
                } else {
                    col[j] += 1;
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