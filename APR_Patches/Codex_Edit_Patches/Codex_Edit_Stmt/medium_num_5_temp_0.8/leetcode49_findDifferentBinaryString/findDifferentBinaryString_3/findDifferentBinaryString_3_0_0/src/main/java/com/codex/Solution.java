package com.codex;

import java.util.*;

public class Solution {
public class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        char[][] char2D = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        return sb.toString();
    }

    
}