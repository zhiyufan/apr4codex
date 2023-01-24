package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = Integer.parseInt(nums[i]);
            for (int j = 0; j < 32; j++) {
                counts[j] += (currentNumber >> j) & 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            sb.append(counts[i] % 3 == 0 ? '0' : '1');
        }
        return sb.toString();
    }

    
}