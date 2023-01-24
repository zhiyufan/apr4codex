package com.codex;

import java.util.*;

public class Solution {
public class FindDiffInArr {

    public static void main(String[] args) {
        String[] arr = {"110010", "111001", "010010"};
        String s = findDifferentBinaryString(arr);
        System.out.println(s);
    }

    public static String findDifferentBinaryString(String[] nums) {

        if (nums == null || nums.length < 2) {
            return "";
        }
        int n = nums.length;
        int m = nums[0].length();
        char[][] char2D = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char2D[j][i] = nums[j].charAt(i);
            }
        }
        String s = "";
        for (int i = 0; i < m; i++) {
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

    
}