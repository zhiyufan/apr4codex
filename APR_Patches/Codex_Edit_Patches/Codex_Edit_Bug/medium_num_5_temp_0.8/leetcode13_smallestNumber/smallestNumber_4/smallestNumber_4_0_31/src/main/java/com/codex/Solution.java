package com.codex;

import java.util.*;

public class Solution {
   public static long smallestNumber(long num) {
        
        String s = String.valueOf(num);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String newS = new String(c);
        int i = 0;
        char temp = newS.charAt(0);
        while (newS.charAt(i) == '0') {
            temp = newS.charAt(i);
            i++;
        }
        if (i != 0) {
            
            newS = newS.substring(0, i) + temp + newS.substring(i + 1);
            newS = newS.substring(1);
            
            }
   

        return Long.parseLong(newS);
    }

}