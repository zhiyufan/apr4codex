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
            sb.append(counts[i] % 2 == 0 ? '0' : '1');
        }
        return sb.toString();
    }

    
}