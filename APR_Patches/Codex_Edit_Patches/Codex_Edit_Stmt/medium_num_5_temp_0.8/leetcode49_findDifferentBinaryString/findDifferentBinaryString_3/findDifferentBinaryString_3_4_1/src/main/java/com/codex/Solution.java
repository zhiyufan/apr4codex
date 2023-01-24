package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        char[][] char2D = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
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
    public static String findDifferentBinaryString(String[] nums) {
        String s = "";
        for (int i = 0; i < nums[0].length(); i++) {
            int ones = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j].charAt(i) == '1') {
                    ones++;
                }
            }
            if (ones <= nums.length / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}