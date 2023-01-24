package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
        public static int sumDigits(int n) {
        // return the sum of all the digits in n
        int ret = 0;
        while (n > 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }
        return sb.toString();
    }

    
}