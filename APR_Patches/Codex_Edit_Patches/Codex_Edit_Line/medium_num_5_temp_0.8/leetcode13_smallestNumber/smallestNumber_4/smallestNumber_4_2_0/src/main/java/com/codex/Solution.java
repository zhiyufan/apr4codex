package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        if (newS.charAt(c.length - 1) == '0') {
            boolean lastNotZero = false;
            int i = 0;
            while (!lastNotZero) {
                if (newS.charAt(c.length - i - 1) != '0') {
                    lastNotZero = true;
                    char temp = newS.charAt(c.length - 1);
                    newS = newS.substring(0, c.length - i - 1) + temp + newS.substring(c.length - i);
                    newS = newS.substring(0, c.length - 1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }

    
}