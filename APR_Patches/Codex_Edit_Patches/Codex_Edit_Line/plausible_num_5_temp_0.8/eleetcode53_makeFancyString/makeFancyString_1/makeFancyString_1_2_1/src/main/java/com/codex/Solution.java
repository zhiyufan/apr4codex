package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            int delta = 3;
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - delta)) {
                sb.deleteCharAt(i);
                i -= 2;
            }
        }

        return sb.toString();
    }

    
}