package com.codex;

import java.util.*;

public class Solution {
public static long smallestNumber(long num) {

    if (num <= 0) {
        return 0;
    }

    String s = String.valueOf(num);
    int firstNotZeroIndex = 0;
    int i = 0;
    for (i = 0; i < s.length(); i++) {
        if (s.charAt(i) != '0') {
            firstNotZeroIndex = i;
            break;
        }
    }
    if (i == s.length()) {
        return num;
    }
    if (s.length() > 1) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        if (newS.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;
            while (!firstNotZero) {
                if (newS.charAt(i) != '0') {
                    firstNotZero = true;
                    char temp = newS.charAt(0);
                    newS = newS.substring(0, i) + temp + newS.substring(i + 1);
                    newS = newS.substring(1);
                } else {
                    i++;
                }
            }
        }
        return Long.parseLong(newS);
    }

    
}