package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        // base case
        if (nums == null || nums.length == 0) {
            return "";
        }
        // two arrays to store the "sum" of each row and each col
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];
        // loop through all the nums
        for (String num : nums) {
            // loop through each num and count the number of 0 and 1
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        // construct the result string
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