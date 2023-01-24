package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        // Find the number of rows
        int n = nums[0].length();

        // Create a 2D array of character from the given array
        char[][] char2D = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }

        // String to be returned
        String res = "";

        // Iterate over each column
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                res += "0";
            } else {
                res += "1";
            }
        }
        return res;
    }

    
}