package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        //check if the length of each string in the array is same
        for (int i = 1; i < nums.length; i++) {
            if (nums[i].length() != n) {
                System.out.println("The number of binary strings are not equal");
                System.exit(0);
            }
        }

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
            if (ones == n/2) {
                System.out.println("There is no majority element");
                System.exit(0);
            } else if (ones <= n/2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }





    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        //check if the length of each string in the array is same
        for (int i = 1; i < nums.length; i++) {
            if (nums[i].length() != n) {
                System.out.println("The number of binary strings are not equal");
                System.exit(0);
            }
        }

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
            if (ones == n/2) {
                System.out.println("There is no majority element");
                System.exit(0);
            } else if (ones <= n/2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}