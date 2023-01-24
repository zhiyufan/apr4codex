package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        int n = s.length();
        if (n < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
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
        return sb.toString();
    }

    
}