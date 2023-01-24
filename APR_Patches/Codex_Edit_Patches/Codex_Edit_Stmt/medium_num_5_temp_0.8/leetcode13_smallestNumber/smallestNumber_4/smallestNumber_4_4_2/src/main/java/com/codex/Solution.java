package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            char min = s.charAt(i);
            int minInd = i;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) < min) {
                    min = s.charAt(j);
                    minInd = j;
                }
            }
            newS += min;
            s = s.substring(0, minInd) + s.substring(minInd + 1);
        }
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