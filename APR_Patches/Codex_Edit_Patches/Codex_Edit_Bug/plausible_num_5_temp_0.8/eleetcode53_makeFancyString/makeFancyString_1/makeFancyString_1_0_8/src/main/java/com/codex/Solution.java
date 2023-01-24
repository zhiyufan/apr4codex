package com.codex;

import java.util.*;

public class Solution {
public class Code {

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaaabbbc"));
        System.out.println(makeFancyString("abbb"));
        System.out.println(makeFancyString("abc"));
    }

    public static String makeFancyString(String string) {

        StringBuilder sb = new StringBuilder(s);


        if (string.length() < 3) {
            return string;
        }

        if (string.charAt(0) == string.charAt(1) && string.charAt(0) == string.charAt(2)) {
            sb.deleteCharAt(1);
        }

        for (int i = 3; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1) && string.charAt(i) == string.charAt(i - 2)) {
                sb.deleteCharAt(i - 1);
                i -= 2;               
            }
}
        }

        return sb.toString();
    }

    
}