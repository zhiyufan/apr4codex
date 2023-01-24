package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();
        int[] bits = new int[nums[0].length()];
        for (String num : nums) {
            String[] binaryString = num.split("");
            for (int i = 0; i < bits.length; i++) {
                bits[i] += Integer.parseInt(binaryString[i]);
            }
        }
        for (int bit : bits) {
            if (bit % 3 == 0) {
                result.append(0);
            } else {
                result.append(1);
            }
        }
        return result.toString();
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