package com.codex;

import java.util.*;

public class Solution {
   public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && i != 1 && i != sb.length() - 1) {
                sb.deleteCharAt(i); 
            } else if (sb.charAt(i) == sb.charAt(i - 1) && i == 1) {
                sb.deleteCharAt(i);
                i = 0;
            } else if (sb.charAt(i) == sb.charAt(i - 1) && i == sb.length() - 1) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb.toString();
    }

    
}