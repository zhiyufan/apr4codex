package com.codex;

import java.util.*;

public class Solution {

public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        char temp = ' ';
        if (newS.length() == 1) return Long.parseLong(newS);
        if (newS.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (newS.charAt(i) != '0') {
                    firstNotZero = true;
                    temp = newS.charAt(0);
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        if (newS.length() == 1 && newS.charAt(0) == '0') return Long.parseLong(String.valueOf(temp));
        if (newS.length() == 1 && newS.charAt(0) == '0') return Long.parseLong(String.valueOf(temp));
        return Long.parseLong(newS);
    }

    
}