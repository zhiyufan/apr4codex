package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length()-2; i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2) && sb.charAt(i) == sb.charAt(i - 3)) {
                sb.deleteCharAt(i);
                i -= 3;
            }
        }

        return sb.toString();
    }

    
}