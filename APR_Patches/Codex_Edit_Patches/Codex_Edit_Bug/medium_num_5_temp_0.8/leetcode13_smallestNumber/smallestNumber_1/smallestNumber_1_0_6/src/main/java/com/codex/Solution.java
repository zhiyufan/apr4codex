package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        int[] res = new int[10];
        while (num > 0) {
            res[(int)(num % 10)]++;
            num /= 10;
        }
        int index = 0;
        for (int i = 1; i < 10; i++) {
            if (res[i] > 0) {
                index = i;
                res[i]--;
                break;
            }
        }
        long min = index;
        for (index = 0; index < 10; index++) {
            while (res[index]-- > 0) {
                min = min * 10 + index;
            }
        }
        return min;
    }

public static String insertAsterisks(String s) {
        if (s == null || s.length() <= 1) return s;
        StringBuffer sb = new StringBuffer();
        char c = s.charAt(0);
        sb.append(c);
        for (int i = 1; i < s.length(); i++) {
            if (c != s.charAt(i)) {
                c = s.charAt(i);
                sb.append('*');
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
}