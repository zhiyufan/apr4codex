package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        String result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < nums[i].length(); j++) {
                if (result.charAt(j) == nums[i].charAt(j)) {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
            result = sb.toString();
        }

        return result;
    }



    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}