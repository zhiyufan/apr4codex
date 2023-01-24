package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[32];
        for (int i = 0; i < nums.length; i++) {
            String current = nums[i];
            for (int j = 0; j < 32; j++) {
                if (current.charAt(31 - j) == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int current = counts[i] * 2 > nums.length ? '0' : '1';
            sb.append((char) current);
        }
        return sb.toString();
    }

    
}