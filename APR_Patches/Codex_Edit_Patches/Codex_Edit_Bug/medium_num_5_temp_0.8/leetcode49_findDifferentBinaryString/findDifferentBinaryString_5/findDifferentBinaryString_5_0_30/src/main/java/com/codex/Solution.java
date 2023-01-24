package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[nums.length];
        int maxLen = nums[0].length();
        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(0) == '0') zeroes++;
            else ones++;
            for (int j = 0; j < maxLen; j++) {
                if (nums[i].charAt(j) == '1') {
                    counts[maxLen - j - 1]++;
                    break;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if (zeroes == 0) {
            sb.append('0');
        } else if(ones == 0) {
            sb.append('1');
        } else {
            sb.append('0');
            for (int i = 0; i < counts.length; i++) {
                sb.append(counts[i] * 2 > nums.length ? '0' : '1');
            }
        }
        return sb.toString();
    }

    
}