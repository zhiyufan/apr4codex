package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ones[j] += nums[i].charAt(j) - '0';
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ones[i] <= n / 2 ? '0' : '1');
        }
        return sb.toString();
    }

    
}