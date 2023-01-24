package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String sNew = new String(c);
        if (sNew.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (sNew.charAt(i) != '0') {
                    firstNotZero = true;
                    char temp = sNew.charAt(0);
                    sNew = sNew.substring(0, i) + temp + sNew.substring(i + 1);
                    sNew = sNew.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(sNew);
    }
}