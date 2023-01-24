package com.codex;

import java.util.*;

public class Solution {
import java.util.stream.Collectors;
import java.util.stream.IntStream;

    public static String makeFancyString(String s) {
        

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);
            if (i == 0) {
                sb.append(thisChar);
            } else {
                char lastChar = sb.charAt(sb.length() - 1);
                char lastLastChar = sb.length() >= 2 ? sb.charAt(sb.length() - 2) : ' ';
                if (lastChar != thisChar && lastLastChar != thisChar) {
                    sb.append(thisChar);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(makeFancyString("abcabcbb"));
        System.out.println(makeFancyString("bbbbb"));
        System.out.println(makeFancyString("pwwkew"));
        System.out.println(makeFancyString("c"));
        System.out.println(makeFancyString("au"));
        System.out.println(makeFancyString("aab"));

        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1, 10000).forEach((i) -> sb.append("a"));
        System.out.println(makeFancyString(sb.toString()));
    }

}