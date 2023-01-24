package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] nums) {

        int n = nums[0].length();
        int[] ones = new int[n];
        for (int i = 0; i < ones.length; i++) {
            ones[i] = 0;
        }
        for (String s : nums) {
            for (int i = 0; i < n; i++) {
                ones[i] += s.charAt(i) == '1' ? 1 : 0;
            }
        }

        String s = "";
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < n; j++) {
                if (char2D[j][i] == '1') {
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