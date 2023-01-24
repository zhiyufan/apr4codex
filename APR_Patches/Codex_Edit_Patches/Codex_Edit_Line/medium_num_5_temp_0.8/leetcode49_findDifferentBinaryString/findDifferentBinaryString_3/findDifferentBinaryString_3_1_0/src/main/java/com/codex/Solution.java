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

     public static int maxInArray(int[] nums, int l, int r) {
        if (l == r) {
            return nums[l];
        } else {
            int m = l + (r - l) / 2;
            int left = maxInArray(nums, l, m);
            int right = maxInArray(nums, m + 1, r);
            return Math.max(left, right);
        }
    }
}