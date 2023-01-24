package com.codex;

import java.util.*;

public class Solution {
import java.util.Arrays;
import java.lang.Math;

    public static long smallestNumber(long num) {

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
        return Long.valueOf(newS);
    }





    public static int solution(int X, int Y, int D) {
        int jumps;
        if (X == Y) {
            return 0;
        } else {
            jumps = (Y - X) / D;
            if ((X + D * jumps) < Y) {
                jumps++;
            }
        }
        return jumps;
    }














    
}