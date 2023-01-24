package com.codex;

import java.util.*;

public class Solution {
    public static long smallestNumber(long num) {
        /** You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.
         * Return the rearranged number with minimal value.
         * Note that the sign of the number does not change after rearranging the digits.
         */
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