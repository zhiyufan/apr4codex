package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums[0].length();
        int[] char2D = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char2D[i] += nums[i].charAt(j);
            }
        }
        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j] & (1 << i) != 0) {
                    ones++;
                }
            }
            if (ones <= n / 2) {
                s += "0";
            } else {
                s += "1";
            }
        }
        return s;
    }

    
}