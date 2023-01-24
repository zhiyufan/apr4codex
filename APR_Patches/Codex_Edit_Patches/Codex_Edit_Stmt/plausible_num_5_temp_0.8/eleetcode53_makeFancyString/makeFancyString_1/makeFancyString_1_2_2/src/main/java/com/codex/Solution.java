package com.codex;

import java.util.*;

public class Solution {
public class Main {
    public static void main(String[] args) {
        System.out.println(makeFancyString("AAaabbbbbCCc"));
    }
    
    public static String makeFancyString(String str) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < sb.length(); i++) {
            if (i > 1 && sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i -= 2;
            }
        }
        return sb.toString();
    }

    
}