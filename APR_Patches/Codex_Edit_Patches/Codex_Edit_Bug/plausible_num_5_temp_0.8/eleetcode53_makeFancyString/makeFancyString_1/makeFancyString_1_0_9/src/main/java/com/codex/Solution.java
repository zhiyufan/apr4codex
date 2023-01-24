package com.codex;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(makeFancyString("aabbaccc"));
        System.out.println(makeFancyString("ababcdcdababcdcd"));
    }

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 2; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
                sb.deleteCharAt(i);
                i = 0;
            }
        }

        return sb.toString();
    }

    
}