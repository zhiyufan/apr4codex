package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < sb.length(); i++) {
            if (i >= 2 && sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i -= 2; // Decrement i so we don't miss a character because of deleting two of them.
            }
        }

        return sb.toString();
    }

    
}