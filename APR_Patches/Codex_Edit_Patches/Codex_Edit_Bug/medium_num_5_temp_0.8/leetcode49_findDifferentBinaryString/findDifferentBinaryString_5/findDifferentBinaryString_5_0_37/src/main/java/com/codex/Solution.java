package com.codex;

import java.util.*;

public class Solution {
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

    public static String findDifferentBinaryString2(String[] nums) {
        String[] binaryStrings = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            binaryStrings[i] = Integer.toBinaryString(num);
        }
        int length = binaryStrings[0].length();
        int count = 0;
        int[] counts = new int[length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (binaryStrings[j].charAt(i) == '1') {
                    count++;
                }
            }
            counts[i] = count;
            count = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }
}