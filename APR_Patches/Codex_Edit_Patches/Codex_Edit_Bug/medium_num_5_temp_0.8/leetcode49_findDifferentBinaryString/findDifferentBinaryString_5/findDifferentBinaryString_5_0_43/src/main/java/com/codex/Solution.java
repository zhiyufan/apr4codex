package com.codex;

import java.util.*;

public class Solution {
  public static String findDifferentBinaryString(String[] nums) {
        
        int[] counts = new int[36];
        for (int i = 0; i < nums.length; i++) {
            char[] current = nums[i].toCharArray();
            for (int j = 0; j < current.length; j++) {
                if (current[j] == '1') {
                    counts[j]++;
                }
            }
        }
        int len = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                len = i + 1;
            }
        }
        int[] newCounts = new int[len];
        for (int i = 0; i < len; i++) {
            newCounts[i] = counts[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newCounts.length; i++) {
            sb.append(newCounts[i] * 2 > nums.length ? '0' : '1');
        }
        return sb.toString();
    }

    
}