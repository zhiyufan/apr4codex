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
public static void main(String[] args) {
        int[] arr = new int[] { 4, 3, 5, 6, 7, 9, 5, 6, 3, 9, 5, 6, 7, 9, 5, 6,
                7, 9, 5, 6, 7, 9, 5, 6, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5,
                7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 3, 5, 6, 7, 9, 5, 6, 7, 9, 5,
                6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7,
                9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5, 6, 7, 9, 5,
                6, 7, 9, 5, 6, 7, 9, 5, 6, 9 };
        System.out.println(findFirstNonRepeated(arr));
    }

    
}