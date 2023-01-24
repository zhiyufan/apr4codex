package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] num) {
        
        String nums = new String[n];
        int count = 0;
        if (nums == null || nums.length == 0) {
            return "";
        }
        
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums[0].length();
        char[][] char2D = new char[nums.length][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[count][j] = nums[count].charAt(j);
            }
            count++;
        }
        String s = "";
        for (int col = 0; col < n; col++) {
            int ones = 0;
            for (int row = 0; row < n; row++) {
                if (char2D[row][col] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}