package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        char[][] char2D = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char2D[row][col] = nums[row].charAt(col);
            }
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