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
            // 1 -> 0000000000000000000000000000001
            // 1 -> 0000000000000000000000000000001
            // 0 -> 00000000000000000000000000000000
            // 1 -> 0000000000000000000000000000001
            // 每一位的1的个数
            sb.append(counts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}