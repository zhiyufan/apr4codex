package com.codex;

import java.util.*;

public class Solution {
public class Play {

    public static void main(String[] args) {
        String[] nums = {"0001", "0011", "0110", "1000"};

        System.out.println(findDifferentBinaryString(nums));
    }

    public static String findDifferentBinaryString(String[] nums) { //O(n^2) time and space complexity

        int n = nums.length;
        char[][] char2D = new char[n][n];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length(); j++) {
                char2D[i][j] = nums[i].charAt(j);
            }
        }
        String s = "";
        for (int i = 0; i < nums[0].length(); i++) {
            int ones = 0;
            for (int j = 0; j < nums.length; j++) {
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
}