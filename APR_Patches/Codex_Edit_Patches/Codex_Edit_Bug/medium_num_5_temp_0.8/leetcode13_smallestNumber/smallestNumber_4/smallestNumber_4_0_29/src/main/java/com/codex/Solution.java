package com.codex;

import java.util.*;

public class Solution {
import java.lang.reflect.Array;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        long n = 5267059;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String newStr = new String(ch);

        if (newStr.charAt(0) == '0') {
            boolean firstNotZero = false;
            int i = 0;

        
        String s = String.valueOf(num);
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