package com.codex;

import java.util.*;

public class Solution {
public class test {
    public static void main(String[] args) {
        String s = "aaaaabbbbcccc";
        System.out.println(makeFancyString(s));
    }

    private static String makeFancyString(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 2;
        while (i < sb.length()) {
            if (sb.charAt(i) == sb.charAt(i - 1) && sb.charAt(i) == sb.charAt(i - 2)) {
            i++;
                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb.toString();
    }

}
}