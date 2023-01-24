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
    public static void main(String[] args) {

        String x = "aabccaabcd";
        String y = "aabbcddeeff";
        String z = "abc";
        System.out.println(makeFancyString(x));
        System.out.println(makeFancyString(y));
        System.out.println(makeFancyString(z));
    }
        return sb.toString();
    }

    
}