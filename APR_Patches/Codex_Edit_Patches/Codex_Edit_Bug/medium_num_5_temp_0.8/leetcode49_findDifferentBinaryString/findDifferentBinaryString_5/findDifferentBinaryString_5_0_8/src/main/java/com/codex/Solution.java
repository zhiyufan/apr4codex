package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        if(nums == null || nums.length == 0) {
            return "";
        }
        int len = nums[0].length();
        int[] counts = new int[len];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(counts[i] * 2 > nums.length ? '1' : '0');
        }
        return sb.toString();
    }

    
}