package com.codex;

import java.util.*;

public class Solution {
    public static String findDifferentBinaryString(String[] strs) {
        
        if (strs.length == 0) {
            return "";
        }
        
        int n = strs[0].length();
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