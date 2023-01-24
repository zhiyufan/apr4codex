package com.codex;

import java.util.*;

public class Solution {
    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) { // check from 3rd character
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i -= 2; // to check from 3rd character
            }
        }

        return sb.toString();
    }
}