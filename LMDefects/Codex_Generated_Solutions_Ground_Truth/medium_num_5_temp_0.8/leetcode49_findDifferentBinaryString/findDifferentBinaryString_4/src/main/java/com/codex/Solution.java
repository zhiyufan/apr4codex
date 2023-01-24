package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        /** Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
         */
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
    }}