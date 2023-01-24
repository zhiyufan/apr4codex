package com.codex;

import java.util.*;

public class Solution {
public String[] findMissing(String[] s) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String num : s) {
            min = Math.min(min, Integer.valueOf(num));
            max = Math.max(max, Integer.valueOf(num));
        }

        int diff = max - min + 1;
        if (diff != s.length) {
            int j = 0;
            String[] missing = new String[diff - s.length];
            for (int i = min; i <= max; i++) {
                if (Arrays.binarySearch(s, String.valueOf(i)) < 0) {
                    missing[j++] = String.valueOf(i);
                } 
            }
        }
        return res;
    }
    
}