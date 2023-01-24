package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {

        if (nums == null || nums.length == 0) {
            return "";
        }
        int[] row = new int[nums[0].length()];
        int[] col = new int[nums[0].length()];

        for (String num : nums) {
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    row[i] += 1;
                } else {
                    col[i] += 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums[0].length(); i++) {
            if (row[i] > col[i]) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(findDifferentBinaryString(new String[]{"0100", "1100", "1101", "0101"}));
        System.out.println(findDifferentBinaryString(new String[]{"1000", "1100", "1101", "0101"}));
        System.out.println(findDifferentBinaryString(new String[]{"0101", "0101", "0101", "0101"}));
        System.out.println(findDifferentBinaryString(new String[]{"0100", "0011", "1100", "0101"}));
    }
}