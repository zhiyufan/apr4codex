package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar.toUpperCase());
            } else {
                char lastChar = sb.charAt(sb.length() - 1).toUpperCase();
                if (lastChar != thisChar.toUpperCase()) {
                    sb.append(thisChar.toLowerCase());
                }
            }
        }
        return sb.toString();
    }
}