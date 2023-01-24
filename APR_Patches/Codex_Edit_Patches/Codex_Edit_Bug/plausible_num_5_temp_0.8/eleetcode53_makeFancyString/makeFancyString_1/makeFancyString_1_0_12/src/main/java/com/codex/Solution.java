package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length();) {
            if (sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
            }
            else i++;
        }

        for (int i = 2; i < sb.length();) {
            else i++;
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2) && sb.charAt(i) != ' ') {
                sb.deleteCharAt(i);
                i -= 2;
            }
        }

        return sb.toString();
    }

    
}